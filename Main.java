package computerComponentsDetails;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println(" **** Computer details :****");
		Computer c=new Computer();
		c.typeOfOS="Mac";
		c.display();
		System.out.println();
		System.out.println(" **** Mother board details :****");
		//MotherBoard mb=new MotherBoard();
		c.mb=new MotherBoard();
		c.mb.mb_Id="AB12";
		c.mb.qualityRating="4.5";
		c.mb.warrantyPeriod="one year";
		c.mb.display();
		System.out.println();
		System.out.println(" mother board bill details :");
		c.mb.b=new Bill();
		c.mb.b.b_No="123";
		c.mb.b.serviceTax="500";
		c.mb.b.centralTax="1000";
		c.mb.b.stateTax="1000";
		c.mb.b.transportTax="2000";
		c.mb.b.baseProductPrice="50000";
		c.mb.b.display();
		System.out.println();
		System.out.println(" mother board company brand details :");
		//Company com=new Company(); 
		c.mb.com=new Company();
		c.mb.com.c_Id="xyz";
		c.mb.com.cName="Dell";
		c.mb.com.email="xyz@dell.com";
		c.mb.com.display();
		System.out.println();
		System.out.println(" mother board company brand address details :");
		//Address ads=new Address();
		c.mb.com.ads=new Address();
		c.mb.com.ads.doorNo="1-9-4147";
		c.mb.com.ads.pin=50044;
		c.mb.com.ads.city="Hyderabad";
		c.mb.com.ads.state="Telagana";
		c.mb.com.ads.display();
		//Bill b=new Bill();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println(" **** Key Board details **** ");
		System.out.println();
		KeyBoard kb=new KeyBoard();
		kb.k_Id="AHDJ5456";
		kb.qualityRating="3.5";
		kb.warrantyPeriod="one year";
		kb.display();
		System.out.println();
		System.out.println(" key board bill details :");
		kb.b=new Bill();
		kb.b.b_No="321";
		kb.b.centralTax="1000";
		kb.b.serviceTax="1500";
		kb.b.transportTax="2000";
		kb.b.stateTax="500";
		kb.b.transportTax="5000";
		kb.b.baseProductPrice="10000";
		kb.b.display();
		System.out.println();
		System.out.println(" key board company brand details :");
		kb.com=new Company();
		kb.com.c_Id="KSJDKLS84385";
		kb.com.cName="Lenovo";
		kb.com.email="lenovo@gmail.com";
		kb.com.display();
		System.out.println();
		System.out.println(" key board company brand address details :");
		kb.com.ads=new Address();
		kb.com.ads.doorNo="1-9-6547";
		kb.com.ads.city="Secunderabad";
		kb.com.ads.pin=500214;
		kb.com.ads.state="Telangana";
		kb.com.ads.display();
		
		/*Continue with other things as well*/
		/*keep coding*/
		
		System.out.println();
		System.out.println();
		System.out.println(" **** Monitor details **** ");
		System.out.println();
		Monitor mr=new Monitor();
		mr.m_Id="AHDJ5456";
		mr.qualityRating="3.5";
		mr.width="16cms";
		mr.height="5.5''";
		mr.warrantyPeriod="one year";
		mr.display();
		System.out.println();
		System.out.println(" key board bill details :");
		mr.b=new Bill();
		mr.b.b_No="321";
		mr.b.centralTax="1000";
		mr.b.serviceTax="1500";
		mr.b.transportTax="2000";
		mr.b.stateTax="500";
		mr.b.transportTax="5000";
		mr.b.baseProductPrice="10000";
		mr.b.display();
		System.out.println();
		System.out.println(" key board company brand details :");
		mr.com=new Company();
		mr.com.c_Id="KSJDKLS84385";
		mr.com.cName="Lenovo";
		mr.com.email="lenovo@gmail.com";
		mr.com.display();
		System.out.println();
		System.out.println(" key board company brand address details :");
		mr.com.ads=new Address();
		mr.com.ads.doorNo="1-9-6547";
		mr.com.ads.city="Secunderabad";
		mr.com.ads.pin=500214;
		mr.com.ads.state="Telangana";
		mr.com.ads.display();
	}
}
