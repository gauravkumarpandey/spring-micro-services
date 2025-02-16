FROM amazoncorretto:17 as build
WORKDIR /licensing-service

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} application.jar 

RUN java -Djarmode=layertools -jar application.jar extract

FROM amazoncorretto:17
WORKDIR /licensing-service

COPY --from=build /licensing-service/dependencies/ ./
COPY --from=build /licensing-service/spring-boot-loader/ ./
COPY --from=build /licensing-service/snapshot-dependencies/ ./
COPY --from=build /licensing-service/application/ ./

ENTRYPOINT [ "java" , "org.springframework.boot.loader.launch.JarLauncher"]



