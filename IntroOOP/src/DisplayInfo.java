
public class DisplayInfo {

	public static void main(String[] args) {
		
	Student st = new Student();
	Student st1 = new Student();
	
	//st.Name ="Shahin";
	//st.roll = 10;
	st.getInfo("Shahin",10);
	st.display();
	
	//System.out.println("Name is: "+st.Name);
	//System.out.println("Roll is: "+st.roll);
	
	//st1.Name ="Afsar";
	//st1.roll = 11;
	st1.getInfo("Afsar",11);
	st1.display();
	
	//System.out.println("Name is: "+st1.Name);
	//System.out.println("Roll is: "+st1.roll);
	}

}
