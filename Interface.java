package ServiceInterface;

import model.Car;

import java.util.List;

public interface CarServiceInterface {

    public boolean saveCarModel(Car car);
    public List<Car> listAllCarModel();
    public boolean deleteCarModel(Car car);

    public boolean updateCarModel(Car car);

    public Car getCarModel(String platNo);
}
