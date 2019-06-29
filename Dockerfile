FROM openjdk:8-alpine

COPY target/uberjar/api.jar /api/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/api/app.jar"]
