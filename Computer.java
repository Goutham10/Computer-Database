package computerComponentsDetails;

public class Computer 
{
	String typeOfOS;
	MotherBoard mb;
	KeyBoard kb;
	CPU c;
	Mouse m;
	RAM r;
	Monitor mr;
	Bill b;
	Company com;
	Address ads;
	
	
	public Computer(String typeOfOS, MotherBoard mb, KeyBoard kb, CPU c, Mouse m, RAM r, Monitor mr, Bill b,
			Company com, Address ads) {
		super();
		this.typeOfOS = typeOfOS;
		this.mb = mb;
		this.kb = kb;
		this.c = c;
		this.m = m;
		this.r = r;
		this.mr = mr;
		this.b = b;
		this.com = com;
		this.ads = ads;
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println(" type of OS :"+typeOfOS);
		System.out.println(" type of Mother Board :"+mb);
		System.out.println(" keyboard :"+kb);
		System.out.println(" CPU :"+c);
		System.out.println(" Mouse :"+m);
		System.out.println(" RAM :"+r);
		System.out.println(" Monitor :"+mr);
		System.out.println(" Bill :"+b);
		System.out.println(" Company :"+com);
		System.out.println(" Address :"+ads);
	}
}
