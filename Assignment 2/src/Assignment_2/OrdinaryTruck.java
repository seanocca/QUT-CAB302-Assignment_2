package Assignment_2;

import java.util.*;

public class OrdinaryTruck extends Truck {
	
	public ArrayList<ArrayList<Item>> cargo = new ArrayList<ArrayList<Item>>(); 
	public double cost;
	
	//Creates the ordinary truck
	public OrdinaryTruck(ArrayList<ArrayList<Item>> cargo) throws Exception {
		//Gets the array size
		int numCargo = cargo.size();
		//Makes certain the amount of cargo is less than 100 items
		if (numCargo <= 1000) {
			this.cargo = cargo;
		} else {
			throw new DeliveryException();
		}
		
		//Determines the cost of the moving cargo
		this.cost = 750 + (0.25 * numCargo);
	}
	
	//Returns the cost of the truck
	public double GetCost() {
		return this.cost;
	}
	
	//Returns the actual array of cargo
	public ArrayList<ArrayList<Item>> GetCargo(){
		return this.cargo;
	}	
}
