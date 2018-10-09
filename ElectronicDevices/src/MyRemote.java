import java.util.ArrayList;
import java.util.List;


public class MyRemote {

	public static void main(String[] args) {
	
		KitchenDevices newDevice = OvenRemote.getDevice();
		
		TurnOvenOn onCommand = new TurnOvenOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		
        TurnHeatUp heatUpCommand = new TurnHeatUp(newDevice);
		
		onPressed = new DeviceButton(heatUpCommand);
		
		onPressed.press();
		onPressed.press();

	}

}
