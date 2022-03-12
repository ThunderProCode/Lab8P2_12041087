package MainPackage;

import java.util.ArrayList;

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
