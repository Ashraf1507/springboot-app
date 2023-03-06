FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/spring-hr-management-app.war spring-hr-management-app.war
ENTRYPOINT ["java", "-war", "spring-hr-management-app.war"]

