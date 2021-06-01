
public class Client {

	public static void main(String[] args) {

		Vehicle vehicle=VehicleFactory.createVehicle(VehicleType.TRUCK);
		System.out.println(vehicle);
		
		Vehicle vehicle2=VehicleFactory.createVehicle(VehicleType.CAR);
		System.out.println(vehicle2);
		
		Vehicle vehicle3=VehicleFactory.createVehicle(VehicleType.BIKE);
		System.out.println(vehicle3);
		
	}

}
