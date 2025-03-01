FROM gradle:jdk23 as build
WORKDIR /app
COPY . .
# Thêm quyền thực thi cho gradlew
RUN chmod +x ./gradlew
RUN ./gradlew build -x test

FROM openjdk:23-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
