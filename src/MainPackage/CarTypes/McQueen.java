/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.CarTypes;

import MainPackage.Car;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author ThunderKnight
 */
public class McQueen extends Car {

    public McQueen(int id, String name, Color color) {
        super(id, name, color);
    }
    

    
    @Override
    public void startRace(){
        Random r = new Random();
        int nextDistance = r.nextInt(200-20)+20;
        this.setDistance(this.getDistance() + nextDistance);
    }
    
    
}
