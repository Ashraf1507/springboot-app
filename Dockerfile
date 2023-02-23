FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/spring-hr-management-app.jar spring-hr-management-app.jar
ENTRYPOINT ["java", "-jar", "spring-hr-management-app.jar"]

