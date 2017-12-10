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
public class Ride {
    int Request_ID;
    int Ride_ID;
    int Driver_ID;
    int Passenger_ID;
    int Car_ID;
    int Pickup_Time;
    int Dropoff_Time;
    int Driver_Rating;
    String Status;
    int Cost;

    public Ride(int Request_ID, int Ride_ID, int Driver_ID, int Passenger_ID, int Car_ID, int Pickup_Time, int Dropoff_Time, int Driver_Rating, String Status, int Cost) {
        this.Request_ID = Request_ID;
        this.Ride_ID = Ride_ID;
        this.Driver_ID = Driver_ID;
        this.Passenger_ID = Passenger_ID;
        this.Car_ID = Car_ID;
        this.Pickup_Time = Pickup_Time;
        this.Dropoff_Time = Dropoff_Time;
        this.Driver_Rating = Driver_Rating;
        this.Status = Status;
        this.Cost = Cost;
    }

    public int getRequest_ID() {
        return Request_ID;
    }

    public void setRequest_ID(int Request_ID) {
        this.Request_ID = Request_ID;
    }

    public int getRide_ID() {
        return Ride_ID;
    }

    public void setRide_ID(int Ride_ID) {
        this.Ride_ID = Ride_ID;
    }

    public int getDriver_ID() {
        return Driver_ID;
    }

    public void setDriver_ID(int Driver_ID) {
        this.Driver_ID = Driver_ID;
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int Passenger_ID) {
        this.Passenger_ID = Passenger_ID;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public void setCar_ID(int Car_ID) {
        this.Car_ID = Car_ID;
    }

    public int getPickup_Time() {
        return Pickup_Time;
    }

    public void setPickup_Time(int Pickup_Time) {
        this.Pickup_Time = Pickup_Time;
    }

    public int getDropoff_Time() {
        return Dropoff_Time;
    }

    public void setDropoff_Time(int Dropoff_Time) {
        this.Dropoff_Time = Dropoff_Time;
    }

    public int getDriver_Rating() {
        return Driver_Rating;
    }

    public void setDriver_Rating(int Driver_Rating) {
        this.Driver_Rating = Driver_Rating;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
    
    
    
    
    
    
    
    
    public void endRide()
    {
        this.Status = "Ended";
    }
    
    public void Pay()
    {
        this.Status = "Paid";
    }
}
