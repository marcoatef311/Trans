/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author mac
 */
public class Passenger extends User implements Serializable{
    
    private static final long serialVersionUID = -9110091352417177133L;
    int Passenger_ID;
    //ArrayList<Ride> Rides = new ArrayList<Ride>();
    int Rate;
    int Payment_ID;

    public Passenger(int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
    }

    public Passenger(int Passenger_ID, int Rate, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
        this.Passenger_ID = Passenger_ID;
        this.Rate = Rate;
        this.Payment_ID = Payment_ID;
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int Passenger_ID) {
        this.Passenger_ID = Passenger_ID;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
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
    
    
    
    
    
    
    
    
    
    public boolean requestRide()
    {
        //new object mn Request w nzbt elparameters lw hn7tag
        return true;
    }
    
//    public void cancelRequest (Request request)
//    {
//        request.Status = "Canceled";
//    }
    
    public void ratePassenger (int Rate)
    {
        this.Rate = Rate;
    }
    
    public boolean checkDriverAvailability (Driver driver)
    {
        return driver.Availability;
    }
}
