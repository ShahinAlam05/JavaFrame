
import java.util.*;

public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n = sc.nextInt();
		System.out.println("Method M1: "+M1(n));
		System.out.println("Method M2: "+M2(n));
		//System.out.println("Method M3: "+Integer.parseInt(M3(n)));
	}
	
	public static int M1 (int n) {
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	public static int M2 (int n) {
		int n1 = n;
		while(n1>=10) {
			n1 = 0;
			while(n>0) {
				n1+=n%10;
				n/=10;
			}
			n = n1;
		}
		return n1;
	}

}
