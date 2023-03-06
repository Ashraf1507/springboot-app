FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/spring-hr-management-app.jar spring-hr-management-app.jar
ENTRYPOINT ["java", "-war", "spring-hr-management-app.war"]

