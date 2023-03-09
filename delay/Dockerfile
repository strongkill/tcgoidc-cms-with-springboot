FROM amazoncorretto:latest
# 作者
MAINTAINER Wing Yuen <strongkill@yahoo.com.hk>

ENV TZ Asia/Shanghai

# Bundle APP files
RUN mkdir -p /home/Service && cp /usr/share/zoneinfo/${TZ} /etc/localtime && echo ${TZ} > /etc/timezone

WORKDIR /home/Service
COPY ../target/v2-0.0.1-SNAPSHOT.war /home/Service

# Show current folder structure in logs
#RUN ls -al -R
EXPOSE 8080
CMD [ "java","-jar","v2-0.0.1-SNAPSHOT.war"]
