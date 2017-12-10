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
public class Paypal extends Payment{
    String Email;
    String Password;

    public Paypal(int Payment_ID, int Passenger_ID) {
        super(Payment_ID, Passenger_ID);
    }

    public Paypal(String Email, String Password, int Payment_ID, int Passenger_ID) {
        super(Payment_ID, Passenger_ID);
        this.Email = Email;
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int Passenger_ID) {
        this.Passenger_ID = Passenger_ID;
    }
    
    
}
