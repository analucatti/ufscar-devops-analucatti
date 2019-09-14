package com.example.docker;

enum Constants {
    URI("/welcome"),
    WELCOME("Welcome to the DevOps culture!!!"),
    ;
    private String type;

    Constants(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
