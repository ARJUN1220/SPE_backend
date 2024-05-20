FROM openjdk
WORKDIR /app
ADD target/jairu-0.0.1-SNAPSHOT.jar /app/jairu-0.0.1-SNAPSHOT.jar
EXPOSE 8086
CMD ["java", "-jar", "jairu-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]
