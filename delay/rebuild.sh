#!/bin/sh
docker stop v2admin
docker rm v2admin
docker rmi v2

mvn clean compile package -Pprod -Dmaven.test.skip=true

docker build -t v2 -f delay/Dockerfile .

docker run --name v2admin -p 8080:8080 -d v2