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
public class DriverApplication {
    int User_ID;
    int Application_ID;
    int Age;
    String Vehicle_Type;
    String City;
    boolean License;
    boolean Status;

    public DriverApplication(int User_ID, int Application_ID, int Age, String Vehicle_Type, String City, boolean License, boolean Status) {
        this.User_ID = User_ID;
        this.Application_ID = Application_ID;
        this.Age = Age;
        this.Vehicle_Type = Vehicle_Type;
        this.City = City;
        this.License = License;
        this.Status = Status;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public int getApplication_ID() {
        return Application_ID;
    }

    public void setApplication_ID(int Application_ID) {
        this.Application_ID = Application_ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(String Vehicle_Type) {
        this.Vehicle_Type = Vehicle_Type;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public boolean isLicense() {
        return License;
    }

    public void setLicense(boolean License) {
        this.License = License;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
    
}
