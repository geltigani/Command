
public class Oven implements KitchenDevices{

    private int heat = 0;

	@Override
	public void on() {
		System.out.println("Oven is ON");
		
	}

	@Override
	public void off() {
		System.out.println("Oven is OFF");
		
	}

	@Override
	public void heatUp() {
		heat++;
		System.out.println("Oven heat is at " + heat);
		
	}

	@Override
	public void heatDown() {
		heat--;
		System.out.println("Oven heat is at " + heat);
		
	}

}
