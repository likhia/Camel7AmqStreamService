oc new-build fuse7-java-openshift:1.7~https://github.com/likhia/Camel7AmqStreamService.git --name=amqfusedemo

sleep 60s

oc new-app amqfusedemo:latest

oc start-build amqfusedemo --git-repository=https://github.com/likhia/Camel7AmqStreamService.git#main --incremental=false 

oc expose service/camel7amqstreamservice