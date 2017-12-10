/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.Observable;

/**
 *
 * @author mac
 */
public class Request extends Observable{
    int Passenger_ID;
    int Driver_ID;
    String Car_Type;
    String Status;
    String Promo;
    int Cost;

    public Request(int Passenger_ID, int Driver_ID, String Car_Type, String Status, String Promo, int Cost) {
        this.Passenger_ID = Passenger_ID;
        this.Driver_ID = Driver_ID;
        this.Car_Type = Car_Type;
        this.Status = Status;
        this.Promo = Promo;
        this.Cost = Cost;
        notifyObservers(toString());
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int Passenger_ID) {
        this.Passenger_ID = Passenger_ID;
    }

    public int getDriver_ID() {
        return Driver_ID;
    }

    public void setDriver_ID(int Driver_ID) {
        this.Driver_ID = Driver_ID;
    }

    public String getCar_Type() {
        return Car_Type;
    }

    public void setCar_Type(String Car_Type) {
        this.Car_Type = Car_Type;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPromo() {
        return Promo;
    }

    public void setPromo(String Promo) {
        this.Promo = Promo;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
    
    
    
    
    
    public void acceptRideRequest()
    {
        this.Status = "Accepted";
    }
    
    public void declineRideRequest()
    {
        this.Status = "Declined";
    }
    
    public boolean usePromoCode(String promo)
    {
        //for loop btlf 3ala elpromocode arraylist somewhere
        this.Cost = Cost = 200; //exaple leldiscount amount gowa elpromocode class
        return true;
    }
}
