/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.bson.Document;

/**
 *
 * @author mac
 */
public class TransportationServer {
    
    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    DB database = mongoClient.getDB("admin");
    MongoCollection<Document> collection = (MongoCollection<Document>) database.getCollection("AOOSE");
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            AuthenticationInterface auth = new Authentication();
            Registry r = LocateRegistry.createRegistry(1099);
            r.bind("auth", auth);
            System.out.println("Server running.");
        } catch (Exception ex) {
        }
        
    }
    
    public void insertUser(User u)
    {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(u);
        Document doc = Document.parse(json);
        collection.insertOne(doc);
    }
    
    
}
