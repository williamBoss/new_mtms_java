FROM java:8
VOLUME /tmp
ADD ./target/ruoyi-gateway-1.1.0-SNAPSHOT.jar ruoyi-gateway.jar
RUN bash -c 'touch /ruoyi-gateway.jar'
EXPOSE 9527
ENTRYPOINT [ "java", "-jar", "/ruoyi-gateway.jar" ]