FROM openjdk:8-alpine

COPY target/uberjar/recipe-buddy.jar /recipe-buddy/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/recipe-buddy/app.jar"]
