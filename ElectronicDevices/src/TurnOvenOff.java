
public class TurnOvenOff implements Command {
    KitchenDevices theDevice;
	public TurnOvenOff(KitchenDevices newDevice) {
		
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.off();
		
	}

}
