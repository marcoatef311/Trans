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
public class Payment {
    int Payment_ID;
    int Passenger_ID;

    public Payment(int Payment_ID, int Passenger_ID) {
        this.Payment_ID = Payment_ID;
        this.Passenger_ID = Passenger_ID;
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
