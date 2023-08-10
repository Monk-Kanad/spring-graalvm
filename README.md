# springboot-graalvm application run steps
To run this application in local just install jdk with graalvm and build this application with 

>./gradlew bootRun

But this poc is mainly focused on to run as container image
So to create container image hit below command

>./gradle bootBuildImage

after creation of this image we can run like a normal image in container

>docker run 'imageid'
