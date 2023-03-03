package ro.ciprian.parking;

public class App {

	public static void main(String[] args) {
		
		Parking parking = new Parking();
				
		Car bmw = new Car();
		bmw.setCar("PH88ABC");
		Car peugeot = new Car("B88ABC");
		Car tesla = new Car("XYZ");
		
		parking.parkCar(peugeot);
		parking.parkCar(bmw);
		parking.parkCar(tesla);
		System.out.print("\n");
		parking.getCars();
		parking.exitCar(bmw);
		System.out.print("\n");
		parking.getCars();
		
	}

}
