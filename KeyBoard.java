package computerComponentsDetails;

public class KeyBoard 
{
	String k_Id;
	String qualityRating;
	String warrantyPeriod;
	Company com;
	Bill b;
	
	
	public KeyBoard(String k_Id, String qualityRating, String warrantyPeriod, Company com, Bill b) {
		super();
		this.k_Id = k_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		this.com = com;
		this.b = b;
	}


	public KeyBoard() 
	{
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println(" Key Board id    :"+k_Id);
		System.out.println(" Quality rating  :"+qualityRating);
		System.out.println(" warranty period :"+warrantyPeriod);
		//System.out.println(" MB company brand:"+com);
		//System.out.println(" key board bill  :"+b);
	}
}
