FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/openshift-cicd_demo.jar openshift-cicd_demo.jar
WORKDIR /opt/app
ENTRYPOINT ["java","-jar","/openshift-cicd_demo.jar"]
EXPOSE 8080