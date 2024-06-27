package com.epam.mjc;

public class studentNotFoundException  extends IllegalArgumentException{

    public studentNotFoundException(String message) {
        super(message);
    }
}
