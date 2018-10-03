package computerComponentsDetails;

public class Bill 
{
	String b_No;
	String serviceTax;
	String transportTax;
	String centralTax;
	String stateTax;
	String baseProductPrice;
	
	public Bill(String b_No, String serviceTax, String transportTax, String centralTax, String stateTax,
			String baseProductPrice) {
		super();
		this.b_No = b_No;
		this.serviceTax = serviceTax;
		this.transportTax = transportTax;
		this.centralTax = centralTax;
		this.stateTax = stateTax;
		this.baseProductPrice = baseProductPrice;
	}
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println(" Bill number       :"+b_No);
		System.out.println(" Service Tax.      :"+serviceTax);
		System.out.println(" Transport Tax     :"+transportTax);
		System.out.println(" Central Tax 	   :"+centralTax);
		System.out.println(" State Tax 	   :"+stateTax);
		System.out.println(" Base product price:"+baseProductPrice);
	}


	
}
