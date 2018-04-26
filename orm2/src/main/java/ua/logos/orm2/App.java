package ua.logos.orm2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.entity.Car;
import ua.logos.entity.CarColor;
import ua.logos.entity.CarFuelType;
import ua.logos.entity.CarMake;
import ua.logos.entity.CarModel;
import ua.logos.entity.CarSeller;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = factory.createEntityManager();
		
		CarColor carColor = new CarColor();
		carColor.setColor("WHITE");
		
		CarFuelType carFuelType = new CarFuelType();
		carFuelType.setFuelType("DIESEL");
		
		CarSeller carSeller = new CarSeller();
		carSeller.setAge(15);
		carSeller.setFirstName("asdg");
		carSeller.setLastName("wert");
		carSeller.setPhoneNumber(236423625);
		
		CarMake carMake = new CarMake();
		carMake.setMakeTitle("Audi");
		carMake.setManufactureYear(1999);
		
		CarModel carModel = new CarModel();
		carModel.setCarColor(carColor);
		
		Car car = new Car();
		car.setCarMake(carMake);
		
		
		
		em.getTransaction().begin();
    }
}
