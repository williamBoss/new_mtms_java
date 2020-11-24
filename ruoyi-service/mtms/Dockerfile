FROM java:8
VOLUME /tmp
ADD ./target/mtms-1.1.0-SNAPSHOT.jar mtms.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
RUN bash -c 'touch /mtms.jar'
EXPOSE 8003
ENTRYPOINT [ "java", "-jar", "/mtms.jar" ]