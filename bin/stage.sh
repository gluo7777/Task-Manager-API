#!/bin/bash
# Variables
name="taskservlet"
war="$name.war"
dest="$webapps/$name"
# Function
mvn clean package;
sudo rm -rf "$dest";
sudo cp target/$war --target-directory="$webapps";
