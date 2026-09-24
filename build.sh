#!/bin/sh
# Compile and run the project. Jenkins runs this on every push.
set -e
rm -rf out
mkdir -p out
javac -d out src/Main.java
java -cp out Main
