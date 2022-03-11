/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThunderKnight
 */
public class TableThread extends Thread {
    
    public void run(Car car){
        
        while(car.getDistance() < Main.MainScreen.getTrackLength()){
            
            System.out.println("Updating daddy");
            DefaultTableModel model = (DefaultTableModel) Main.MainScreen.getCarsTable().getModel();
            model.setRowCount(0);

            for (Car car1 : Main.Functions.getCarsList()) {
                model.addRow(new Object[]{car1.getId(),car1.getName(),car1.getDistance()});
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TableThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }
}
