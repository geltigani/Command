
public class TurnOvenOn implements Command {
    KitchenDevices theDevice;
	public TurnOvenOn(KitchenDevices newDevice) {
		
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.on();
		
	}

}
