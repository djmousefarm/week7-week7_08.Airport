/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
import java.util.*;
public class Airport {
    private ArrayList<Airplane> Airplanes;
    
    public Airport() {
        this.Airplanes = new ArrayList<Airplane>();
    }
    
    public void addAirplane (Airplane airplane) {
        Airplanes.add(airplane);
    }
    
    public ArrayList getAirplanes() {
        return Airplanes;
    }

    public Airplane getSpecificAirplane(String ID) {
        for (Airplane listedAirplane : this.Airplanes) {
            if (listedAirplane.getID()==ID) return listedAirplane;
        }
        return null;        
    }
}
