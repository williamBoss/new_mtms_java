FROM java:8
VOLUME /tmp
ADD ./target/mtms-1.1.0-SNAPSHOT.jar mtms.jar
RUN bash -c 'touch /mtms.jar'
EXPOSE 8003
ENTRYPOINT [ "java", "-jar", "/mtms.jar" ]