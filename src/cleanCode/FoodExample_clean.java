package cleanCode;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Food {
	private String name;
	private Date expirationDate;

	public Food(String name, Date expirationDate) {
		this.name = name;
		this.expirationDate = expirationDate;
	}
	
	public boolean isExpired() {
		Date now = Date.from(Instant.now());
		return this.expirationDate.before(now);
	}
	
	public boolean compareName(String name) {
		return this.name.equals(name);
	}
}

interface IFridge {
	public void putInFood(Food f);
	public List<Food> getExpiredFoods();
}

class Fridge implements IFridge {
	private List<Food> foods = new ArrayList<>();
	
	@Override
	public void putInFood(Food f) {
		foods.add(f);
	}

	@Override
	public List<Food> getExpiredFoods() {
		List<Food> expiredFoods = new ArrayList<>();
		for (Food food: foods) {
			if (food.isExpired()) {
				expiredFoods.add(food);
			}
		}
		return expiredFoods;
	}
	
	public Food searchForFoodWithName(String name) {
		for (Food food: foods) {
			if (food.compareName(name))
				return food;
		}
		return null;
	}
	
	public boolean takeOut(Food food) {
		return foods.remove(food);
	}
}
public class FoodExample_clean {
	// this code does not violate clean code principles
}
