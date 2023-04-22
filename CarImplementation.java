package ServiceInterface;

import CarRepository.carDao;
import model.Car;

import java.util.List;

public class CarServiceImplement implements CarServiceInterface{
    carDao carDao = new carDao();
    @Override
    public boolean saveCarModel(Car car) {

        return carDao.saveCarModel(car);
    }

    @Override
    public List<Car> listAllCarModel() {
        List<Car> cr = carDao.findAll();
        return cr;

    }

    @Override
    public boolean deleteCarModel(Car car) {
        return carDao.deletCarModel(car);

    }


    @Override
    public boolean updateCarModel(Car car) {
       return carDao.updateCar(car);

    }

    @Override
    public Car getCarModel(String platNo) {
        Car carmod =carDao.findByPlateNo(platNo);

return carmod;
    }
}
