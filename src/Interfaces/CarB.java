package interfaces;

public class CarB implements Drivable{

	private boolean isVehicleStart=false;

        @Override
	public void Drive()
	{
		if(isVehicleStart)
		{
			System.out.println("Driving vehicle");
		}
		else
		{
			System.out.println("Start the vehicle first");
		}
	}
	
        @Override
	public void Start()
	{
		System.out.println("Starting Vehicle");
		isVehicleStart=true;
	}
	
	
}
