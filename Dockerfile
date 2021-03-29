FROM openjdk:15

WORKDIR /opt/foo

COPY ./target/*.jar ./bar.jar

ENTRYPOINT ["java","-jar","bar.jar"]
