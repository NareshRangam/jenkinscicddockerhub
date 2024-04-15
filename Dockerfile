FROM openjdk:17
WORKDIR /appContainer
COPY ./target/jenkinscicddockerhub.jar /appContainer
EXPOSE 8282
CMD ["java","-jar","jenkinscicddockerhub.jar"]