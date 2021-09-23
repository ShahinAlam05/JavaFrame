

public class Student {
  
	
	String Name;
	int roll;
	
	Student(String n,int r)
	{
	    
		Name = n;
		roll = r;
	
	}
	
	Student()
	{
		System.out.println("This is default Constructor");
	}
	
	void display()
	{
		System.out.println("Name is: "+Name);
		System.out.println("Roll is: "+roll);
	}
}
