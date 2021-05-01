package aint.electronics;

public class Toyota {
    Car carModelType;
    Car carMakeYear;

    public Toyota(){}
    public Toyota(Car carModelType){
        this.carModelType = carModelType;
    }
    public Toyota(Car carModelType, Car carMakeYear){
        this.carModelType = carModelType;
        this.carMakeYear = carMakeYear;
    }
    public void carSpec(){
        System.out.println("Toyota Car Spec: "+ carModelType.getModel()+ " "+ carMakeYear.getYear());
    }
}
