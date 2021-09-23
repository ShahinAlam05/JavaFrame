
public class GetandSet {

	public static void main(String[] args) {
		
		GetandSetClass ob = new GetandSetClass();
		//ob.name = "Shahin";
		//ob.roll = 10;
		
		ob.setNameRoll("Shahin",10);
		
		
		
		
		System.out.println("Name is: "+ob.getName());
		System.out.println("Roll is: "+ob.getRoll());

	}

}
