mvn clean package

cp target/Exam1.jar docker/java/
sh build.sh

docker-compose up -d

sleep 15