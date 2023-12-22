#!/bin/bash

# Directory where your Dockerfile is located
DOCKERFILE_DIR="pa_frontend"

# Image name and tag
IMAGE_NAME="yuchencao01/pa-frontend"
TAG="tag"

# Change to the directory with the Dockerfile
cd ..
cd $DOCKERFILE_DIR

# Build the Docker image
echo "Building Docker image..."
docker build -t $IMAGE_NAME:$TAG .

echo "Docker image build process completed."
