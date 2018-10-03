package computerComponentsDetails;

public class RAM 
{
	String capacity;
	String r_Id;
	String qualityRating;
	String warrantyPeriod;
	Bill b;
	Company com;
	
	
	public RAM(String capacity, String r_Id, String qualityRating, String warrantyPeriod, Bill b, Company com) {
		super();
		this.capacity = capacity;
		this.r_Id = r_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		this.b = b;
		this.com = com;
	}


	public void display()
	{
		System.out.println(" capacity :"+capacity);
		System.out.println(" ram id :"+r_Id);
		System.out.println(" Quality rating :"+qualityRating);
		System.out.println(" warranty period :"+warrantyPeriod);
		System.out.println(" MB company brand :"+com);
		System.out.println(" key board bill :"+b);
	}
}
