/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner reader;
    private Flights setOfFlights;
    private Airport currentAirport;
    
    public UserInterface (Scanner reader) {
        this.reader = reader;
        this.setOfFlights = new Flights();
        this.currentAirport = new Airport();
    }
    
    public void start() {
        
    }
    
    public void airportPanel() {
       
        while(true) {
            System.out.println("Airport panel");
            System.out.println("--------------------");        

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");
            String input = this.reader.nextLine();
            input = input.toLowerCase().trim();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                flightService();
            }
        }

    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String ID = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = this.reader.nextInt();
        Airplane newAirplane = new Airplane(ID,capacity);
        currentAirport.addAirplane(newAirplane);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String ID = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String depAirCode = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destAirCode = this.reader.nextLine();
        //this.currentAirport.getAirplanes().
        
    }
    
    public void flightService() {
        
        System.out.println("Flight service");
        System.out.println("------------
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print(">");
            String input = this.reader.nextLine();
            input = input.toLowerCase().trim();
            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();             
            } else if (input.equals("x")) {
                break;
            }
        
        }
    }
            
    public void printPlanes() {
        
    } 
    
    public void printFlights() {
        
    }
    
    public void printPlaneInfo() {
        
    }

}

