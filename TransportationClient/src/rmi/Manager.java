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
public class Manager extends User{
    int Manager_ID;

    public Manager(int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
    }

    public Manager(int Manager_ID, int User_ID, String First_Name, String Last_Name, String Address, String Phone_Number, String Email, String Country, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Address, Phone_Number, Email, Country, Username, Password);
        this.Manager_ID = Manager_ID;
    }

    public int getManager_ID() {
        return Manager_ID;
    }

    public void setManager_ID(int Manager_ID) {
        this.Manager_ID = Manager_ID;
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
    
    
    
    
    
    
    
    
    public void acceptDriverApplication(DriverApplication app)
    {
        app.Status = true;
    }
    
    public void declineDriverApplication(DriverApplication app)
    {
        app.Status = false;
    }
    
    public void suspendDriver(Driver driver)
    {
        driver.Status = "Suspended";
    }
    
    public void bamDriver(Driver driver)
    {
        driver.Status = "Banned";
    }
}
