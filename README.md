# Build
mvn clean package && docker build -t es.eisig/tutorialproject .

# RUN

docker rm -f tutorialproject || true && docker run -d -p 8080:8080 -p 4848:4848 --name tutorialproject es.eisig/tutorialproject 