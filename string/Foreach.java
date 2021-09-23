package string;

public class Foreach {
	public static void main(String args[])
	{
		int[] num= {10,20,30,40};
		int sum=0;
		for(int f:num)
		{
			sum=sum+f;
		}
		System.out.println(sum);
	}

}
