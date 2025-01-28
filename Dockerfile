FROM eclipse-temurin:21
LABEL maintainer="joaoppinheiro2005@gmail.com"
WORKDIR /GerenciadorDeOficina
COPY target/MecManager-0.0.1-SNAPSHOT.jar /GerenciadorDeOficina/MecManager
ENTRYPOINT ["java", "-jar", "MecManager"]