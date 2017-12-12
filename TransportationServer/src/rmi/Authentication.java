/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmi.User;

/**
 *
 * @author mac
 */
public class Authentication extends UnicastRemoteObject implements AuthenticationInterface{
    
    public ArrayList<User> registeredUsers;

    public Authentication() throws RemoteException{
        registeredUsers = new ArrayList();
    }
    
    public int getUsersSize()
    {
        return registeredUsers.size();
    }
    
    @Override
    public User login(String username, String password) throws RemoteException {
        for (int i = 0; i < registeredUsers.size(); i++) {
            User u = registeredUsers.get(i);
            if ((u.getUsername().equals(username)) && (u.getPassword().equals(password))) {
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean registerAsPassenger(int Passenger_ID, int Rate, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) throws RemoteException {
        if (alreadyExists(Username)) {
            return false;
        }
            else {
            User u = new Passenger(Passenger_ID, Rate, Payment_ID, User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
            registeredUsers.add(u);
            return true;
        }
    }

    @Override
    public boolean registerAsDriver(int Driver_ID, boolean Availability, int Benefit, int Rate, String Status, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) throws RemoteException {
        if (alreadyExists(Username)) {
            return false;
        }
            else {
            User u = new Driver(Driver_ID, Availability, Benefit, Rate, Status, User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
            registeredUsers.add(u);
            return true;
        }
    }
    
    private boolean alreadyExists(String username) {
        for (int i = 0; i < registeredUsers.size(); i++) {
            if (registeredUsers.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList getRegistered() {
        return registeredUsers;
    }
}
