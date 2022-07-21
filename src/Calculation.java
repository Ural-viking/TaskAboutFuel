
public class Calculation {
	public float distanceBetweenSettlements;
	public float averageFuelConsumption;
	public float totalKilogramsOfFuel; // необходимое количество килограмм топлива, необходимого для поездки
	
	public Calculation() {
		super();
	}
	
	public Calculation(float distanceBetweenSettlements, float averageFuelConsumption) {
		super();
		this.distanceBetweenSettlements = distanceBetweenSettlements;
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public String kilogramsOfFuel(float matterDensity) {
		this.totalKilogramsOfFuel = matterDensity*((distanceBetweenSettlements/100)*averageFuelConsumption);
		String result = "Вес топлива, необходимый, чтобы преодолеть путь - " + totalKilogramsOfFuel + " кг";
		return result;	
	}

}