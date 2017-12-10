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
public class CreditCard extends Payment{
    int Card_Number;
    int CIV;
    int Zipcode;

    public CreditCard(int Payment_ID, int Passenger_ID) {
        super(Payment_ID, Passenger_ID);
    }

    public CreditCard(int Card_Number, int CIV, int Zipcode, int Payment_ID, int Passenger_ID) {
        super(Payment_ID, Passenger_ID);
        this.Card_Number = Card_Number;
        this.CIV = CIV;
        this.Zipcode = Zipcode;
    }

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public int getCIV() {
        return CIV;
    }

    public void setCIV(int CIV) {
        this.CIV = CIV;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int Zipcode) {
        this.Zipcode = Zipcode;
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
