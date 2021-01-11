oc new-build fuse7-java-openshift:1.7~https://github.com/likhia/Camel7AmqStreamService.git#main --name=fuseamqstreamdemo
sleep 60s

oc new-app fuseamqstreamdemo:latest

oc start-build amqfusedemo2 --git-repository=https://github.com/likhia/Camel7AmqStreamService.git#main --incremental=false 

oc expose service/fuseamqstreamdemo