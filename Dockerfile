# FROM ubuntu
# RUN apt-get update && apt-get install wget -y
# RUN mkdir /usr/app
# WORKDIR /usr/app
# COPY gameoflife-build/target/gameoflife-build-1.0-SNAPSHOT.jar /usr/app

FROM ubuntu

RUN apt-get update && apt-get install wget -y
RUN mkdir /usr/app
WORKDIR /usr/app
#RUN cd workspace
COPY /ecommerce-backend/target/ecommrece-application-backend-0.0.1-SNAPSHOT.jar /usr/app
