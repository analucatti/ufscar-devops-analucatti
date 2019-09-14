package com.example.docker;

enum Constants {
    URI("/welcome"),
    HOME("/"),
    APP("Application is up and running!!!"),
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
