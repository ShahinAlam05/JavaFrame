
public class Student {
  
	
	String Name;
	int roll;
	
	void getInfo(String n,int r)
	{
		Name = n;
		roll = r;
	}
	
	void display()
	{
		System.out.println("Name is: "+Name);
		System.out.println("Roll is: "+roll);
	}
}
