package CarRepository;

import model.Car;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class carDao {
    public boolean saveCarModel(Car car) {
        boolean isSaved=true;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
            session.close();
            isSaved=true;
        }catch (Exception e)
        {
            isSaved=false;
        }

        return isSaved;
    }
    public List<Car> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Car");
        List<Car> allCar = query.list();
        session.close();
        return allCar;

    }
    public boolean deletCarModel(Car car){
        boolean saved=false;
       try {
           Session session = HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.delete(car);
           session.getTransaction().commit();
           session.close();
           saved=true;

       }catch (Exception e)
       {
           saved=false;
       }
       return saved;

    }

    public boolean updateCar(Car car){
       boolean isUpdated=false;
        try {
           Session session =HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.update(car);
           session.getTransaction();
           session.close();
            isUpdated=true;
       }catch (Exception e)
       {
           isUpdated=false;
       }
        return isUpdated;
    }

public Car findByPlateNo(String platNo){

        Session session =HibernateUtil.getSessionFactory().openSession();
        return session.get(Car.class,platNo);
}
public List<Car> findByallCar(){
        Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from car");
            List<Car> ca = query.list();
            session.close();
return ca;

}

}
