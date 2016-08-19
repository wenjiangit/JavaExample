
public class NutritionFacts {
	
	private NutritionFacts(Builder builder) {
		servingsize = builder.servingsize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	private int servingsize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium ;
	private int carbohydrate;

	public static class Builder {
		//必选参数
		private int servingsize;
		private int servings;
		//可选参数
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0 ;
		private int carbohydrate = 0;
		
		public Builder(int servingsize,int servings){
			this.servingsize = servingsize;
			this.servings = servings;
		}
		
		public Builder setCalories(int val){
			calories = val;
			return this;
		}
		
		public Builder setFat(int val){
			fat = val;
			return this;
		}
		
		public Builder setSodium(int val){
			sodium = val;
			return this;
		}
		
		public Builder setCarbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	

}

interface Builder<T>{
    T build();
}
