package Assignment_2;

import java.util.*;

public class RefridgeratorTruck extends Truck {
	
	public ArrayList<ArrayList<Item>> cargo = new ArrayList<ArrayList<Item>>();
	public int safeTemp;
	public double cost;
	
	public RefridgeratorTruck(ArrayList<ArrayList<Item>> cargo) throws Exception {
		//Gets the array size
		int numCargo = cargo.size();
		//Make certain the array is no bigger than 800 items
		if (numCargo <= 800) {
			this.cargo = cargo;
		} else {
			throw new DeliveryException();
		}
		
		//Find every highest temp then determine if it is the lowest temp
		//They range between -20 degrees Celsius to 10 degrees Celsius
		/*
		 *Find the safe temperature for the cargo
		for (int i = 0; i <= numCargo; i++) {
			
			this.safeTemp = safeTemp;
		}*/
	}
	
	//Retrieve the cost of the cargo in the refridgerated truck
	public double GetCost(int truckTemperature) {
		double costInDollars;
		costInDollars = 900 + (200 * (0.7* (truckTemperature / 5)));
		return costInDollars;
	}
	
	//Return the cargo array
	public ArrayList<ArrayList<Item>> GetCargo(){
		return this.cargo;
	}
	
	//Return the safest temperature of the truck
	public int GetSafeTemperature() {
		return this.safeTemp;
	}
}
