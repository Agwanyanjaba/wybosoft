FROM openjdk:17
EXPOSE 7070
ADD target/wybosoft-switch.jar wybosoft-switch.jar
ENTRYPOINT ["java","-jar","/wybosoft-switch.jar"]