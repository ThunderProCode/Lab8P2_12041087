package MainPackage.CarTypes;

import MainPackage.Car;
import java.awt.Color;
import java.io.Serializable;
import java.util.Random;

public class Nascar extends Car implements Serializable {

    public Nascar(int id, String name, Color color) {
        super(id, name, color);
    }    
    
    @Override
    public void startRace(){ 
        Random r = new Random();
        int nextDistance = r.nextInt(180-40)+40;
        this.setDistance(this.getDistance() + nextDistance);
    }
    
}
