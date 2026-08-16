FROM eclipse-temurin:22-jdk

WORKDIR /app

COPY . .

RUN mvn clean package

EXPOSE 8080

CMD ["java", "-jar", "target/daniel-restaurant-1.0.0.jar"]