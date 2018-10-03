package computerComponentsDetails;

public class Company 
{
	String c_Id;
	String cName;
	String email;
	Address ads;
	
	
	public Company(String c_Id, String cName, String email, Address ads) {
		super();
		this.c_Id = c_Id;
		this.cName = cName;
		this.email = email;
		this.ads = ads;
	}




	public Company() {
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println(" Company id 	   :"+c_Id);
		System.out.println(" Company name.     :"+cName);
		System.out.println(" Company email     :"+email);
	}
}
