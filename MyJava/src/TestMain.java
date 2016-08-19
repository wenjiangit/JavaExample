

public class TestMain {
	
	public static void main(String[] args) {
		//建造者模式生成实例
		NutritionFacts nf = new NutritionFacts.Builder(20, 10)
		.setCalories(10)
		.setCarbohydrate(0)
		.setFat(0)
		.setSodium(0).build();
	}

}
