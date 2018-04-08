FROM airhacks/glassfish
COPY ./target/tutorialproject.war ${DEPLOYMENT_DIR}
