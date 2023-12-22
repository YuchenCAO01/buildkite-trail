#!/bin/bash

# Directory where your Dockerfile is located for the backend
DOCKERFILE_DIR="pa_backend"

# Image name and tag for the backend
IMAGE_NAME="yuchencao01/pa-backend"
TAG="tag"

# Change to the directory with the Dockerfile
cd ..
cd $DOCKERFILE_DIR

# Build the Docker image
echo "Building Docker image for backend..."
docker build -t $IMAGE_NAME:$TAG .

echo "Docker image for backend build process completed."
