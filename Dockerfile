FROM eclipse-temurin:17
COPY target/taskconsumer.jar taskconsumer.jar
CMD [ "java","-jar","taskconsumer.jar" ]
