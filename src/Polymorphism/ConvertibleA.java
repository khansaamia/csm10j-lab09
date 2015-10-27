package polymorphism;

//convertibleA class extends from class CarA
public class ConvertibleA extends CarA{

    //to store the top state 
	boolean isStateTop=true;
	
        //constructor function
	public ConvertibleA()
	{
            //super class constructor function call
		super();
	}
	
        //putTopUp function checks the stateTop if it is down then will display putting top up
        //and set statetop to true, else display top is already up
	public void PutTopUp()
	{
		if(!isStateTop)
		{
			System.out.println("Putting top up");
			isStateTop=true;
		}
		else
		{
			System.out.println("Top is already up");
		}
	}
	
        //putTopDown function checks the stateTop if it is up then will display putting top down
        //and set stateTop to false, else display top is already down
	public void PutTopDown()
	{
		if(isStateTop)
		{
			System.out.println("Putting top down");
			isStateTop=false;
		}
		else
		{
			System.out.println("Top is already down");
		}
	}
	
}
