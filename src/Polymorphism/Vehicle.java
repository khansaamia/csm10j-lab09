package polymorphism;

//abstract class vehicle
abstract public class Vehicle {

    //to store vehicale start state
	private boolean isVehicleStart;

        //constructor function
	public Vehicle()
	{
            //initialize isVehicleStart variable false assuming the vehicle is 
            //by default is not started
		isVehicleStart=false;
	}
	
        //derive function checks the vehicle start state if it is start
        // then display driving vehicle else will display start the vehicle first
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
	
        //strat fucntion checks the vehicle start state if it is not started
        //then display starting vehicle and set vehicle start state true
	public void Start()
	{
		System.out.println("Starting Vehicle");
		isVehicleStart=true;
	}
	
	
}
