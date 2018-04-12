# JavaEE8 / JakartaEE8 Tutorials

Use this repository to follow along with [these tutorials](https://www.youtube.com/watch?v=4Jir8mDXpr8&list=PLMFz_4xEevvhJJ12R7sKxCD1Pz_wqYn-Z) in case you get lost. The commit message includes the name of the tutorial it represents. The commit `sm - Tutorial 04 - QueryParam basics` represents the code as it was when tutorial 04 was finished.

# Original readme
## Build
mvn clean package && docker build -t es.eisig/tutorialproject .

## RUN

docker rm -f tutorialproject || true && docker run -d -p 8080:8080 -p 4848:4848 --name tutorialproject es.eisig/tutorialproject
