package MainPackage;

import java.awt.Color;
import java.io.Serializable;

public class Car implements Serializable {
    
    private int id;
    private String name;
    private int distance;
    private Color color;

    public Car(int id, String name, Color color) {
        this.id = id;
        this.name = name;
        this.distance = 0;
        this.color = color;
    }
    
    /**
     * Get the value of distance
     *
     * @return the value of distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Set the value of distance
     *
     * @param distance new value of distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", distance: " + distance + ", color: " + color;
    }
   
    
    public void startRace(){
        
    }
    
}
