FROM gradle:7.6.1 as builder

WORKDIR /app
COPY . .
RUN ./gradlew bootJar

FROM openjdk:16.0.2
COPY --from=builder /app/build/libs/ /app

EXPOSE 9595
ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=prod", "/app/app.jar" ]