package Assignment_2;

public class Item {
	
	public String name;
	public int cost, price, reorderPoint, reorderAmount, temperature;
	
	//Create the item block without the temperature variable
	public Item(String name, int cost, int price, int reorderPoint, int reorderAmount) {
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.reorderPoint = reorderPoint;
		this.reorderAmount = reorderAmount;
		//add item to file
	}
	
	//Create the item block with the temperature variable
	public Item(String name, int cost, int price, int reorderPoint, int reorderAmount, int temperature) {
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.reorderPoint = reorderPoint;
		this.reorderAmount = reorderAmount;
		this.temperature = temperature;
		//add item to file
	}
	
	//Return the name of the item
	public String GetName() {
		return this.name;
	}
	
	//Return the cost of the item
	public int GetCost() {
		return this.cost;
	}
	
	public int GetPrice() {
		return this.price;
	}
	
	//Return the reorder point of the item
	public int GetReorderPoint() {
		return this.reorderPoint;
	}
	
	//Return the reorder amount of the item.
	//This checks if the item drops below the reorder point 
	//and reorders this item with this amount.
	public int GetReorderAmount() {
		return this.reorderAmount;
	}
	
	//Returns the "safe" temperature of the item
	public int GetTemperature() {
		return this.temperature;
	}
}
