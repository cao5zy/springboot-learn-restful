cp ./target/testDeploy-0.0.1-SNAPSHOT.war ./target/test.war 
docker cp ./target/test.war web:/usr/local/tomcat/webapps/

