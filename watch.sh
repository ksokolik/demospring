#!/usr/bin/env bash

# watch the java files and continously deploy the service
mvn clean install
export UUID=$(uuidgen)
skaffold run -p dev
reflex -r "\.java$" -- bash -c 'mvn install && skaffold run -p dev'
