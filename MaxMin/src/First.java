import java.util.Scanner;
public class First {

	
	public static void main(String[] args) {
		int[] num = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++)
		{
			num[i] = input.nextInt();
		}
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("The Maximum number is = "+max);
		System.out.println("The Minimum number is = "+min);

	}

}
