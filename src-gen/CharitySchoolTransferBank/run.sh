#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.charityschooltransferbank --module-path aisco.product.charityschooltransferbank -m aisco.product.charityschooltransferbank &

wait