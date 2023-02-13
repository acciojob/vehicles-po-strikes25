package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Had to create a constructor :
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Added the Override annotation :
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
