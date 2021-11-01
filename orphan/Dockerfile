FROM maven:3.8.3-openjdk-16 AS build
ARG mavenOptions
COPY / /home/app/
RUN mvn ${mavenOptions} -f /home/app/pom.xml clean install -DskipTests
RUN mvn ${mavenOptions} -f /home/app/orphan/pom.xml clean package -DskipTests

#
# Package stage
#
FROM tomcat:9.0.54-jdk16-openjdk AS run
COPY --from=build /home/app/orphan/target/orphan-*.war /usr/local/tomcat/webapps/
EXPOSE 8080
