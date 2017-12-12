/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface AuthenticationInterface extends Remote{
    public User login(String username, String password) throws RemoteException;
    
    public boolean registerAsPassenger(int Passenger_ID, int Rate, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) throws RemoteException;
    
    public boolean registerAsDriver(int Driver_ID, boolean Availability, int Benefit, int Rate, String Status, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) throws RemoteException;
    
    public int getUsersSize();
    
    public ArrayList getRegistered();
}
