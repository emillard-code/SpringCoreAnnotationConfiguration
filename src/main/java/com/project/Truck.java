package com.project;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

    public void drive() {
        System.out.println("Driving a truck...");
    }

}