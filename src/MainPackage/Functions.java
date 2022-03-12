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
    
}
