package com.ohgiraffers.c_conditional.level03.hard;

public enum Fruits {
    APPLE(1000 ),
    BANANA(3000 ),
    MELON(2000),
    GRAPE(5000);

    public final int price;

    Fruits(int price) {
        this.price = price;
    }


    int getPrice() {
        return price;
    }


}
