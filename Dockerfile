FROM maven
RUN pwd
COPY my-app /
RUN mvn package 
RUN mvn clean compile assembly:single
RUN ls ./target/

FROM openjdk
WORKDIR /root/
COPY --from=0 target/my-app-1.0-SNAPSHOT-jar-with-dependencies.jar ./
RUN ls /
CMD ["java" , "-jar" , "my-app-1.0-SNAPSHOT-jar-with-dependencies.jar"]
