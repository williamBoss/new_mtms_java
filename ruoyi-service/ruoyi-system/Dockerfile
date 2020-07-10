FROM java:8
VOLUME /tmp
ADD ./target/ruoyi-system-1.1.0-SNAPSHOT.jar ruoyi-system.jar
RUN bash -c 'touch /ruoyi-system.jar'
EXPOSE 8001
ENTRYPOINT [ "java", "-jar", "/ruoyi-system.jar" ]