package com.xiaomaigou.sms;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 发送短信消息监听类
 */
@Component
public class SmsListener {

    @Autowired
    private SmsUtil smsUtil;

    @JmsListener(destination = "xiaomaigou_sms")
    public void sendSms(Map<String, String> map) {

        try {
            System.out.println("接收到监听消息："+map.toString());
            SendSmsResponse response = smsUtil.sendSms(map.get("mobile"), map.get("template_code"), map.get("sign_name"), map.get("param"));
            System.out.print("发送短信返回信息:");
            System.out.print("code:" + response.getCode());
            System.out.println(",message:" + response.getMessage());

        } catch (ClientException e) {
            e.printStackTrace();
        }

    }

}