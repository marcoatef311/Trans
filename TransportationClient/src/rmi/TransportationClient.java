/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class TransportationClient {

    
    private static Home Home;
    private static Register Register;
    private static Login Login;
    private static DriverRegister DriverRegister;
    private static PassengerFeatures PassengerFeatures;
    private static DriverFeatures DriverFeatures;
    private static ManagerFeatures ManagerFeatures;
    
    
    private static AuthenticationInterface auth;
    public static int passengerCount = 1;
    public static int driverCount = 1;
    public static int userCount = 1;
    
    public static void main(String[] args) {
        
        initHome();
        initRegister();
        initLogin();
        
        Home.setVisible(true);
        
        try {
            Registry r = LocateRegistry.getRegistry(1099);
            auth = (AuthenticationInterface) r.lookup("auth");
        } catch (Exception e){
            System.out.println("Exception " + e.toString());
        }
    }
    
    
    
    public static void initHome()
    {
        Home = new Home();
        Home.setLocationRelativeTo(null);
        Home.getRegisterNavButton().addActionListener(new RegisterNavButtonListener());
        Home.getLoginNavButton().addActionListener(new LoginNavButtonListener());
        Home.getDriverRegisterButton().addActionListener(new DriverRegisterNavButton());
    }
    
    public static void initRegister()
    {
        Register = new Register();
        Register.setLocationRelativeTo(null);
        Register.getRegisterButton().addActionListener(new RegisterButtonListener());
        Register.getLoginNavButton().addActionListener(new LoginNavButtonListener());
    }
    
    public static void initLogin()
    {
        Login = new Login();
        Login.setLocationRelativeTo(null);
        Login.getRegisterNavButton().addActionListener(new RegisterNavButtonListener());
        Login.getLoginButton().addActionListener(new LoginButtonListener());
    }
    
    public static void initDriverRegister()
    {
        DriverRegister = new DriverRegister();
        DriverRegister.setLocationRelativeTo(null);
        DriverRegister.getRegisterButton().addActionListener(new DriverRegisterButtonListener());
        DriverRegister.getLoginNavButton().addActionListener(new LoginNavButtonListener());
    }
    
    public static void initPassengerFeatures()
    {
        PassengerFeatures = new PassengerFeatures();
        PassengerFeatures.setLocationRelativeTo(null);
    }
    
    public static void initDriverFeatures()
    {
        DriverFeatures = new DriverFeatures();
        DriverFeatures.setLocationRelativeTo(null);
    }
    
    public static void initManagerFeatures()
    {
        ManagerFeatures = new ManagerFeatures();
        ManagerFeatures.setLocationRelativeTo(null);
    }
    
    
    
    
    
    
    
    
    
    
    
    static class DriverRegisterNavButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Login.dispose();
            initDriverRegister();
            DriverRegister.setVisible(true);
        }
    }
    
    
    
    
    static class RegisterNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Home.dispose();
            initLogin();
            Register.setVisible(true);
        }

    }
    
    
    static class LoginNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Register.dispose();
            initRegister();
            Login.setVisible(true);
        }

    }
    
    
    static class RegisterButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String firstName = Register.getFirstName();
                String lastName = Register.getLastName();
                String Address = Register.getAddress();
                String Country = Register.getCountry();
                String Email = Register.getEmail();
                String PN = Register.getPN();
                String Username = Register.getUsername();
                String Password = Register.getPassword();
                
                boolean result = auth.registerAsPassenger(passengerCount, 0, 0, userCount, firstName, lastName, Address, PN, Email, Country, Username, Password);
                
                if (result = false)
                    JOptionPane.showMessageDialog(null, "Username already exists, please try another one");
                else
                {
                    userCount++;
                    passengerCount++;
                    
                    JOptionPane.showMessageDialog(null, "Registered successfully, please login");
                    Register.dispose();
                    initRegister();
                    Login.setVisible(true);
                }
                
                
            } catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
    
    
    static class DriverRegisterButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String firstName = DriverRegister.getFirstName();
                String lastName = DriverRegister.getLastName();
                String Address = DriverRegister.getAddress();
                String Country = DriverRegister.getCountry();
                String Email = DriverRegister.getEmail();
                String PN = DriverRegister.getPN();
                String Username = DriverRegister.getUsername();
                String Password = DriverRegister.getPassword();
                
                boolean result = auth.registerAsDriver(driverCount, true, 0, 0, "Pending", userCount, firstName, lastName, Address, PN, Email, Country, Username, Password);
                
                if (result = false)
                    JOptionPane.showMessageDialog(null, "Username already exists, please try another one");
                else
                {
                    userCount++;
                    driverCount++;
                    
                    JOptionPane.showMessageDialog(null, "Registered successfully, please login");
                    Register.dispose();
                    initRegister();
                    Login.setVisible(true);
                }
                
                
            } catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
    
    
    static class LoginButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String username = Login.getUsername();
                String password = Login.getPassword();
                
                User u = auth.login(username, password);
                
                if(u == null)
                    JOptionPane.showMessageDialog(null, "Wrong username/password, please try again");
                else
                {
                    JOptionPane.showMessageDialog(null, "Logged in sucessfully");
                    Login.dispose();
                    initPassengerFeatures();
                    initDriverFeatures();
                    initManagerFeatures();
                    
                    if(u instanceof Passenger)
                    {
                        PassengerFeatures.setUsernameLabel(u.getFullName());
                        PassengerFeatures.setVisible(true);
                    }
                    else if(u instanceof Driver)
                    {
                        DriverFeatures.setUsernameLabel(u.getFullName());
                        DriverFeatures.setVisible(true);
                    }
                    else if(u instanceof Manager)
                    {
                        ManagerFeatures.setUsernameLabel(u.getFullName());
                        ManagerFeatures.setVisible(true);
                    }
                }
                
            } catch (Exception ex) {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
}
