# demo

# load different profiles

application.properties
spring.profiles.active=test

# application-dev.properties

server.port=8090

# application-prod.properties

server.port=8091

# Packaging and running

# Packaging the app
mvn clean package -Dspring.profiles.active=staging

# Running the packaged jar with `spring.profiles.active` argument
java -jar -Dspring.profiles.active=staging target/config-properties-demo-0.0.1-SNAPSHOT.jar

mvn spring-boot:run -Dspring.profiles.active=dev



https://www.callicoder.com/spring-boot-configuration-properties-example/
