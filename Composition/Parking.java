package ro.ciprian.parking;

import java.util.ArrayList;

public class Parking {
	
	private static final int SIZE = 3;
	
	private ArrayList<Car> cars = new ArrayList<Car>();
	
	public ArrayList<Car> getCars() {
		for (Car car : this.cars) {
			System.out.println(car.getCar());
		}
		return cars;
	}

	public void parkCar (Car car) {
		if (cars.size() < SIZE) {
			if(car.getCar() !=  null) {
				this.cars.add(car);
			}
			else System.out.println("Masina nu poate fi parcata! Numar inmatriculare invalid!");
		}
		else System.out.println("Parcare indisponibila!");
	}
	
	public void exitCar (Car car) {
		this.cars.remove(car);
	}

}