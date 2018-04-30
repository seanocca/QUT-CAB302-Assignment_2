package Assignment_2;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemTest {

	//Set up testing variables and parameters
	private static Random random = new Random();
	private static String[] itemNames = new String[] {
			"mushrooms",
			"tomatoes",
			"grapes",
			"chicken",
			"beef",
			"fish",
			"frozen vegetable mix",
			"ice cream",
	};
	
	private static int[] itemCosts = new int[] {
			2,1,4,10,12,13,5,8,
	};
	
	private static int[] itemPrices = new int[] {
			4,2,6,14,17,16,8,14,
	};
	
	private static int[] itemOrderPoints = new int[] {
			200,325,125,325,425,375,225,175
	};
	
	private static int[] itemOrderAmounts = new int[] {
			325,400,225,425,550,475,325,250
	};
	
	private static int[] itemSafeTemps = new int[] {
			10,10,9,4,3,2,-12,-20,
	};
	
	private static int randValue() {
		return random.nextInt(itemNames.length); 
	};
	
	private static String randName() {
		return itemNames[randValue()];
	}
	
	private static int randCost() {
		return itemCosts[randValue()];
	}
	
	private static int randPrice() {
		return itemPrices[randValue()];
	}
	
	private static int randOrderPoint() {
		return itemOrderPoints[randValue()];
	}
	
	private static int randOrderAmount() {
		return itemOrderAmounts[randValue()];
	}
	
	private static int randSafeTemp() {
		return itemSafeTemps[randValue()];
	}
	
	Item item;

	@Before
	public void setUp() throws Exception {
		item = null;
	}
	
	@Test
	public void testItemStringintintintint() {
		String itemName = "rice";
		int itemCost = 5;
		int itemPrice = 10;
		int itemOrderPoint = 50;
		int itemOrderAmount = 150;
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
	}
	
	@Test
	public void testItemStringintintintintint() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		int itemSafeTemp = randSafeTemp();

		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount, itemSafeTemp);		
	}


	@Test
	public void testGetName() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
		assertEquals(itemName, item.GetName());
	}

	@Test
	public void testGetCost() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
		assertEquals(itemCost, item.GetCost());
	}

	@Test
	public void testGetPrice() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
		assertEquals(itemPrice, item.GetPrice());
	}

	@Test
	public void testGetReorderPoint() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
		assertEquals(itemOrderPoint, item.GetReorderPoint());
	}

	@Test
	public void testGetReorderAmount() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount);
		assertEquals(itemOrderAmount, item.GetReorderAmount());
	}

	@Test
	public void testGetTemperature() {
		String itemName = randName();
		int itemCost = randCost();
		int itemPrice = randPrice();
		int itemOrderPoint = randOrderPoint();
		int itemOrderAmount = randOrderAmount();
		int itemSafeTemp = randSafeTemp();
		
		item = new Item(itemName, itemCost, itemPrice, itemOrderPoint, itemOrderAmount, itemSafeTemp);
		assertEquals(itemSafeTemp, item.GetTemperature());
	}
}
