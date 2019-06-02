# Configuration
使用spring cloud config server与config client来实现服务的配置获取

## client端配置
首先在pom中加入依赖
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-client</artifactId>
    <version>2.1.1.RELEASE</version>
</dependency>
```

由于配置文件需要先从server端取得，所以要先用bootstrap配置，新建一个bootstrap.properties文件，然后加入比如
```
spring.application.name=client1
```
然后就会从server记录的repository中去取配置文件，文件的命名形式有下面几种
```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```
默认的application名是application，默认的profile名是空{default}