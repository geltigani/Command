
public class TurnHeatUp implements Command {
    KitchenDevices theDevice;
	public TurnHeatUp(KitchenDevices newDevice) {
		
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.heatUp();
		
	}

}
