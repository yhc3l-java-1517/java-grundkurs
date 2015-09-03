class Vehicle {
	int tankSize;
	int fuelConsumption;
	int passengers;
	Vehicle(int tankSize, int fuelConsumption, int passengers){
		this.tankSize = tankSize;
		this.fuelConsumption = fuelConsumption;
		this.passengers = passengers;
	}
	double range(){
		return ((double)tankSize / (double)fuelConsumption ) * 100;
	}
}
