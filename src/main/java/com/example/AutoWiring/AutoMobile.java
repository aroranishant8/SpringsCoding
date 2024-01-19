package com.example.AutoWiring;

public class AutoMobile {

    //AutoWire By Name
    Brake brake1;
    public void setBrake(Brake brake) {
        this.brake1 = brake;
    }

    //AutoWire By Type
    Steering steering;

}
