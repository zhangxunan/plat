FROM hub.c.163.com/wuxukun/maven-aliyun:3-jdk-8
VOLUME /tmp
EXPOSE 8080
ADD plat-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]