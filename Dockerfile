FROM openjdk:11
EXPOSE 8090
ADD target/customerdata.jar customerdata.jar
ENTRYPOINT ["java","-jar","customerdata.jar"]
