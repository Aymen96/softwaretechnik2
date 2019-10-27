package messyCode;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Food {
	String name;
	Date expirationDate;

	public Food(String name, Date expirationDate) {
		this.name = name;
		this.expirationDate = expirationDate;
	}
}

interface IFridge {
	public void putInFood(Food f);
	public ArrayList<Food> getExpiredFoods();
}

class Fridge implements IFridge {
	private List<Food> foods = new ArrayList<>();
	
	@Override
	public void putInFood(Food f) {
		// if (f != null && !foods.contains(f))
		foods.add(f);
	}

	@Override
	public ArrayList<Food> getExpiredFoods() {
		ArrayList<Food> expiredFoods = new ArrayList<>();
		Date now = Date.from(Instant.now());
		for (Food food: foods) {
			if (food.expirationDate.before(now)) {
				expiredFoods.add(food);
			}
		}
		foods.removeAll(expiredFoods);
		return expiredFoods;
	}
	
	public Food searchForFoodWithName(String name) {
		// iterate over each book and return food if names are equal
		for (Food food: foods) if (food.name.equals(name)) return food;
		return null;
	}
	
	public boolean takeOut(Food food) {
		return foods.remove(food);
	}
}
public class FoodExample_messy {
	// this code is messy. The task on consists on recognizing bad coding habits and improve this snippet..
}
