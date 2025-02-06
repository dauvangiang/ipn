# Sử dụng một image có sẵn chứa JDK (ví dụ: OpenJDK 17)
FROM openjdk:23-jdk

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file JAR của ứng dụng vào container
COPY target/*.jar app.jar

# Expose cổng mà ứng dụng Spring Boot sử dụng (mặc định là 8080)
EXPOSE 8080

# Lệnh để chạy ứng dụng
CMD ["java", "-jar", "app.jar"]