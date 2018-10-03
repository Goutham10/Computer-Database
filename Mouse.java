package computerComponentsDetails;

public class Mouse 
{
	String typeOfMouse;
	String m_Id;
	String qualityRating;
	String warrantyPeriod;
	Company com;
	Bill b;
	
	
	public Mouse(String typeOfMouse, String m_Id, String qualityRating, String warrantyPeriod, Company com, Bill b) {
		super();
		this.typeOfMouse = typeOfMouse;
		this.m_Id = m_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		this.com = com;
		this.b = b;
	}


	public void display()
	{
		System.out.println(" Type of Mouse :"+typeOfMouse);
		System.out.println(" Mouse id :"+m_Id);
		System.out.println(" Quality rating :"+qualityRating);
		System.out.println(" warranty period :"+warrantyPeriod);
		System.out.println(" MB company brand :"+com);
		System.out.println(" key board bill :"+b);
	}
}
