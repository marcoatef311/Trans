/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rmi.AuthenticationInterface;

/**
 *
 * @author mac
 */
public class TestClass {
    
    private static AuthenticationInterface auth;
    
    public TestClass() {
    }
    
    @Test
    public void testRegisterAsPassenger() {
        try {            
            boolean result = auth.registerAsPassenger(1, 0, 0, 1, "Marco", "Atef", "Address", "PhoneNumber", "Marco134472@bue.edu.eg", "Cairo", "Marco", "Marco");

            assertEquals(true, result);
}       
        catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
    }
    
    @Test
    public void testRegisterAsDriver() {
        
        try {            
            boolean result = auth.registerAsDriver(3, false, 0, 0, "pending", 3, "Mai", "Mai", "Address", "PhoneNumber", "Mai131883@bue.edu.eg", "Cairo", "Mai", "Mai");

            assertEquals(true, result);
}       
        catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            Registry r = LocateRegistry.getRegistry(1099);
            auth = (AuthenticationInterface) r.lookup("auth");
        } catch (Exception e){
            System.out.println("Exception " + e.toString());
        }
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
