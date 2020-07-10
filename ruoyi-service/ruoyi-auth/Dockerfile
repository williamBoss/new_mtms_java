FROM java:8
VOLUME /tmp
ADD ./target/ruoyi-auth-1.1.0-SNAPSHOT.jar ruoyi-auth.jar
RUN bash -c 'touch /ruoyi-auth.jar'
EXPOSE 8005
ENTRYPOINT [ "java", "-jar", "/ruoyi-auth.jar" ]