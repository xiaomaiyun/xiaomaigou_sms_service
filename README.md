# 小麦购商城(XiaoMaiGou.COM)短信微服务 项目简介(Instruction)
## 一、项目说明
 **小麦购商城(XiaoMaiGou.COM)短信微服务** 项目是[小麦购商城(XiaoMaiGou.COM)](https://github.com/xiaomaiyun/xiaomaigou_parent)项目的 **子项目** ，该项目使用 **阿里大鱼** 实现发送短信功能，使用 **SpringBoot+ActiveMQ** 构建，通过监听类监听ActiveMQ中xiaomaigou_sms实现异步发送短信。

## 二、项目使用
> 1. 下载项目，并且导入到IDE开发工具中（建议使用：IntelliJ IDEA），使用 **Maven** 构建项目
> 2. 修改项目中 **resources/application.properties** 配置文件(accessKeyId和accessKeySecret需要替换成开发者自己的AK(在阿里云访问控制台寻找))
> 3. 完成以上步骤就可以正常部署启动服务
