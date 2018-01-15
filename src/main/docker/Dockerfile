FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/plat-1.0-SNAPSHOT.jar plat.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/plat.jar"]