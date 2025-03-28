#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.charityschooldirectpayment --module-path aisco.product.charityschooldirectpayment -m aisco.product.charityschooldirectpayment &

wait