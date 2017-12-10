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
public class User implements Serializable
{
    int User_ID;
    String First_Name;
    String Last_Name;
    String Address;
    String Phone_Number;
    String Email;
    String Country;
    String Username;
    String Password;

    public User(int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        this.User_ID = User_ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Email = Email;
        this.Country = Country;
        this.Username = Username;
        this.Password = Password;
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

    public String getFullName()
    {
        return First_Name + " " + Last_Name;
    }
    
    
    
    public String viewProfile()
    {
        return "\nUser_ID: " + User_ID + 
                "\nFirst Name: " + First_Name + 
                "\nLast Name: " + Last_Name + 
                "\nAddress: " + Address + 
                "\nPhone Number: " + Phone_Number + 
                "\nEmail: " + Email + 
                "\nCountry: " + Country +
                "\nUsername: " + Username +
                "\nPassword: " + Password ;
    }
    
    public void editProfile( User newUser )
    {
        this.First_Name = newUser.First_Name;
        this.Last_Name = newUser.Last_Name;
        this.Address = newUser.Address;
        this.Phone_Number = newUser.Phone_Number;
        this.Email = newUser.Email;
        this.Country = newUser.Country;
        this.Username = newUser.Username;
        this.Password = newUser.Password;
    }
    
}
