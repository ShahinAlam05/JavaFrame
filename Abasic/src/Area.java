import java.util.Scanner;
public class Area {

	
	public static void main(String[] args) {
	float a,b,area;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextFloat();
		b = input.nextFloat();
		
		area = (float) (0.5*a*b);
		
		System.out.println("The area is = "+area);

	}

}
