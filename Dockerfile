FROM java:8
ADD /target/SpringBoot.jar SpringBoot.jar
ENTRYPOINT ["java","-jar","SpringBoot.jar"]