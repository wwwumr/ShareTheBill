java -jar ./eureka-server/target/demo-0.0.1-SNAPSHOT.jar &

java -jar ./service-wordladder/target/wordladder-0.0.1-SNAPSHOT.jar --spring.profiles.active=service-hi1 &

java -jar ./service-wordladder/target/wordladder-0.0.1-SNAPSHOT.jar --spring.profiles.active=service-hi2 &

java -jar ./service-feign/target/service-feign-0.0.1-SNAPSHOT.jar &

java -jar ./service-ribbon/target/demo-0.0.1-SNAPSHOT.jar &

java -jar ./service-zuul/target/service-zuul-0.0.1-SNAPSHOT.jar &

java -jar ./config-server/target/config-server-0.0.1-SNAPSHOT.jar &
