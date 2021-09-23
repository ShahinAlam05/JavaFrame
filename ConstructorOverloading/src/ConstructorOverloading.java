

class A
{
	String name;
	int roll;
	String sex;
	A()
	{
		System.out.println("No Information.");
	}
	
	A(String n, int r)
	{
		name = n;
		roll = r;
		System.out.println();
		System.out.println("Name is : "+name);
		System.out.println("Roll is : "+roll);
	}
	
	A(String n, int r, String s)
	{
		name = n;
		roll = r;
		sex = s;
		System.out.println();
		System.out.println("Name is : "+name);
		System.out.println("Roll is : "+roll);
		System.out.println("Sex is : "+sex);
	}
}


public class ConstructorOverloading {
	
	public static void main(String[] args)
	{
		A a = new A();
		A b = new A("Alam", 15);
		A c = new A("Korim", 14, "Male");
		
	}

}
