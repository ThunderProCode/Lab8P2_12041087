package MainPackage;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread extends Thread {
    
    public void run(){
        
        for (Car car : Main.Functions.getCarsList()) {
            Thread t1 = new Thread(){
                public void run(){
                    System.out.println(car.getDistance());
                    try {
                        Thread.sleep(1000);
                        car.startRace();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            };
            t1.start();
            Main.MainScreen.getCarProgress().setValue(Main.MainScreen.getCarProgress().getValue() + 1);
            if(car.getDistance() >= Main.MainScreen.getTrackLength()){
                break;
            }
        }
        System.out.println("Carrera Terminada");
        
        
    }
    
}
    
