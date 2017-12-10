/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mac
 */
public class Driver extends User implements Observer, Serializable{
    int Driver_ID;
    boolean Availability;
    //ArrayList<Ride> Rides = new ArrayList<Ride>();
    int Benefit;
    int Rate;
    String Status;

    public Driver(int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
    }

    public Driver(int Driver_ID, boolean Availability, int Benefit, int Rate, String Status, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
        this.Driver_ID = Driver_ID;
        this.Availability = Availability;
        this.Benefit = Benefit;
        this.Rate = Rate;
        this.Status = Status;
    }


    public int getDriver_ID() {
        return Driver_ID;
    }

    public void setDriver_ID(int Driver_ID) {
        this.Driver_ID = Driver_ID;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public int getBenefit() {
        return Benefit;
    }

    public void setBenefit(int Benefit) {
        this.Benefit = Benefit;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    
    
    
    
    public String viewHistory()
    {
//        for (int i=0; i<Rides.size(); i++)
//        {
//            return Ride(i).toString();
//        }
        return "";
    }
    
    public void rateDriver(int Rate)
    {
        this.Rate = Rate;
    }

    @Override
    public void update(Observable observable, Object object) {
        System.out.println("A new request received\nFrom: " + object);
    }
}
