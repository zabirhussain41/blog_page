FROM ubuntu:latest
LABEL authors="zabir"

ENTRYPOINT ["top", "-b"]