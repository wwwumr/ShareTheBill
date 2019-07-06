# ShareTheBill

## Team ##

小组：王笑然、褚宇轩、王志远

## 服务端口

8761：eureka server

9000&9001: service-wordladder // 9000与9001port 分别启动wordladder

9002:service-ribbon  // 使用断路器 当出现错误时返回 Sorry, it seems that we can't provide this service now

9003:service-feign // 使用断路器 当出现错误时返回 Sorry, it seems that we can't provide this service now!

9004:service-zuul //api-a 将采用service-ribbon服务 而api-b将采用service-feign服务

9005:config-server 从github上可以读取配置文件

9006:config-client 从config-server中读取配置信息

9007: service-gateway 

9008：service-oauth

## Code Standard ##

采用阿里java开发手册的规范。

https://github.com/alibaba/p3c