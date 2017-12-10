/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author mac
 */
public class Car {
    int Car_ID;
    int Driver_ID;
    String Model;
    String License;
    String Car_Type;

    public Car(int Car_ID, int Driver_ID, String Model, String License, String Car_Type) {
        this.Car_ID = Car_ID;
        this.Driver_ID = Driver_ID;
        this.Model = Model;
        this.License = License;
        this.Car_Type = Car_Type;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public void setCar_ID(int Car_ID) {
        this.Car_ID = Car_ID;
    }

    public int getDriver_ID() {
        return Driver_ID;
    }

    public void setDriver_ID(int Driver_ID) {
        this.Driver_ID = Driver_ID;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String License) {
        this.License = License;
    }

    public String getCar_Type() {
        return Car_Type;
    }

    public void setCar_Type(String Car_Type) {
        this.Car_Type = Car_Type;
    }
    
    
}
