
public class VehicleFactory {
	
	
	
	public static Vehicle createVehicle(VehicleType vehicleType) {
		if(VehicleType.BIKE.equals(vehicleType)) {
			return new Bike();
		}else if(VehicleType.CAR.equals(vehicleType)) {
			return new Car();
		}else if(VehicleType.TRUCK.equals(vehicleType)) {
			return new Truck();
		}
		
		return null;
		
	}

}
