
public class TurnHeatDown implements Command {
    KitchenDevices theDevice;
	public TurnHeatDown(KitchenDevices newDevice) {
		
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.heatDown();
		
	}

}
