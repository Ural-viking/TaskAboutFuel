
public class Calculation {
	public float distanceBetweenSettlements;
	public float averageFuelConsumption;
	public float totalKilogramsOfFuel; // ����������� ���������� ��������� �������, ������������ ��� �������
	
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
		String result = "��� �������, �����������, ����� ���������� ���� - " + totalKilogramsOfFuel + " ��";
		return result;	
	}

}