package computerComponentsDetails;

public class MotherBoard 
{
	String mb_Id;
	String qualityRating;
	String warrantyPeriod;
	Company com;
	Bill b;

	public MotherBoard(String mb_Id, String qualityRating, String warrantyPeriod, Company com, Bill b) 
	{
		super();
		this.mb_Id = mb_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		this.com = com;
		this.b = b;
	}

	public MotherBoard() {
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println(" Mother Board id   :"+mb_Id);
		System.out.println(" Quality rating    :"+qualityRating);
		System.out.println(" warranty period   :"+warrantyPeriod);
	}
	
}
