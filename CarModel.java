package model;

import ServiceInterface.CarServiceInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car  {
    @Id
    @Column(name="PlateNo")
    private String plateNo;
    @Column(name="carName")
    private String carName;
    @Column(name="carModel")
    private String carModel;
    @Column(name="carType")
    private String carType;

    public Car() {

    }

    public Car(String plateNo, String carName, String carModel, String carType) {
        this.plateNo = plateNo;
        this.carName = carName;
        this.carModel = carModel;
        this.carType = carType;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
