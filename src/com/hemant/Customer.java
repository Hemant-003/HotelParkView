package com.hemant;

class Customer {
    private String name;

    Customer(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
