/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
import java.util.ArrayList;

public class Flights {
    private ArrayList<FlightPath> flightpaths;
    
    public Flights () {
        this.flightpaths = new ArrayList<FlightPath>(); 
    }
    
    public void addFlight (FlightPath flightpath) {
        flightpaths.add(flightpath);
    }
    
    public String printFlights () {
        for (FlightPath outputPath : flightpaths) {
            return outputPath.toString();
        }
        return null;
    }
}

