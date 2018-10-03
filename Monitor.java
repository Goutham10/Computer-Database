package computerComponentsDetails;

public class Monitor 
{
	String width;
	String height;
	String m_Id;
	String qualityRating;
	String warrantyPeriod;
	Bill b;
	Company com;
	
	
	public Monitor(String width, String height, String m_Id, String qualityRating, String warrantyPeriod, Bill b,
			Company com) {
		super();
		this.width = width;
		this.height = height;
		this.m_Id = m_Id;
		this.qualityRating = qualityRating;
		this.warrantyPeriod = warrantyPeriod;
		
	}


	public Monitor() {
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println(" Width of Monitor :"+width);
		System.out.println(" Heigth of Monitor :"+height);
		System.out.println(" Monitor id :"+m_Id);
		System.out.println(" Quality rating :"+qualityRating);
		System.out.println(" warranty period :"+warrantyPeriod);
		
	}
	
	
	
}
