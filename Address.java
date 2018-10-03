package computerComponentsDetails;

public class Address 
{
	String doorNo;
	String city;
	String state;
	int pin;
	
	
	public Address(String doorNo, String city, String state, int pin) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}


	public Address() {
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println(" pin 		  :"+pin);
		System.out.println(" doorNo.	  :"+doorNo);
		System.out.println(" city 		  :"+city);
		System.out.println(" state 		  :"+state);
	}
}
