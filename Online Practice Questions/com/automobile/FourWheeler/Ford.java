package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int currentSpeed;

    public Ford(String modelName, String registrationNumber, String ownerName, int currentSpeed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void tempControl() {
        System.out.println("Control Air-Conditioning Device.");
    }
}