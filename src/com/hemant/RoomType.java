package com.hemant;

public enum RoomType {
    SINGLE(400.0), DOUBLE(500.0);

    double price;
    RoomType(double v) {
        this.price = v;
    }
}
