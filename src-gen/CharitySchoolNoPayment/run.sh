#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.charityschoolnopayment --module-path aisco.product.charityschoolnopayment -m aisco.product.charityschoolnopayment &

wait