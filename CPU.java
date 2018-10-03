package computerComponentsDetails;

public class CPU 
{
	String typeOfProcessor;
	String speed;
	String cpu_Id;
	String qualityRating;
	String warrantyPeriod;
	Company com;
	Bill b;
	
	
	public CPU(String typeOfProcessor, String speed, String cpu_Id, String qualityRating, String warrantyPeriod,
			Company com, Bill b) {
		super();
		this.typeOfProcessor = typeOfProcessor;
		this.speed = speed;
		this.cpu_Id = cpu_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		this.com = com;
		this.b = b;
	}


	public void display()
	{
		System.out.println(" Type of processor :"+typeOfProcessor);
		System.out.println(" spedd :"+speed);
		System.out.println(" CPU id :"+cpu_Id);
		System.out.println(" Quality rating :"+qualityRating);
		System.out.println(" warranty period :"+warrantyPeriod);
		System.out.println(" MB company brand :"+com);
		System.out.println(" key board bill :"+b);
	}
	
}
