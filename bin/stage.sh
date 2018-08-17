#!/bin/bash
# Variables
name="taskservlet"
war="$name.war"
dest="$webapps/$name"
# Function
sudo chown willk777 --recursive .;
mvn clean package;
sudo cp target/$war --target-directory="$webapps";
