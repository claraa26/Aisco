#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.charityschoolewallet --module-path aisco.product.charityschoolewallet -m aisco.product.charityschoolewallet &

wait