oc new-build fuse7-java-openshift:1.7~https://github.com/likhia/Camel7AmqStreamService.git --name=camel7amqstreamservice

sleep 60s

oc new-app camel7amqstreamservice:latest

oc expose service/camel7amqstreamservice