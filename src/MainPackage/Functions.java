package MainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Functions {
    public ArrayList<Car> carsList = new ArrayList();

    public ArrayList<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(ArrayList<Car> carsList) {
        this.carsList = carsList;
    }
    
    public void addCar(Car car){
        this.carsList.add(car);
    }
    
    public void removeCar(Car car){
        this.carsList.remove(car);
    }
    
    public void updateComboBox(){
        Main.MainScreen.getCarInput().removeAllItems();
        
        for (Car car : carsList) {
           Main.MainScreen.getCarInput().addItem(car.getName());
        }
    }
    
    public Car getCarByName(String carName){
        for (Car car : carsList) {
            if(car.getName().equals(carName)){
                return car;
            }
        }
        return null;
    }
    
    public void saveFile(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab8P2_HectorAcosta\\cars.fl");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Car car : carsList) {
                System.out.println(car);
                oos.writeObject(this.carsList);   
            }
            
            oos.close();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    
    public void loadFile(){
        try{
            FileInputStream inFile = new FileInputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab8P2_HectorAcosta\\cars.fl");
            ObjectInputStream objInput = new ObjectInputStream(inFile);
            ArrayList<Car> newCarsList = (ArrayList<Car>) objInput.readObject();
            this.carsList = newCarsList;
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
    //Validadores 
    public boolean idExists(int id){
        for (Car car : carsList) {
            if(car.getId() == id){
                return false;
            }
        }
        return true;
    }
    
    public boolean nameExists(String name){
        for (Car car : carsList) {
            if(car.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
}
