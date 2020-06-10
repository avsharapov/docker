FROM java:8-jdk-alpine
VOLUME /home/docex
COPY target/inno-1.0-SNAPSHOT-jar-with-dependencies.jar /home/docex/
WORKDIR /home/docex
ENTRYPOINT ["java", "-jar", "inno-1.0-SNAPSHOT-jar-with-dependencies.jar"]