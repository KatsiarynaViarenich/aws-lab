FROM maven:3.8.4-openjdk-11 AS build

WORKDIR /app

COPY . .

RUN mvn clean package

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /app/target/your-spring-app.jar .

CMD ["java", "-jar", "your-spring-app.jar"]