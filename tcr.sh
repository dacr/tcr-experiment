#!/usr/bin/sh

while [ 1 ]; do
  sleep 5
  sbt test && git commit -am working || git reset --hard
done
