import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		ArrayList<String> num = new ArrayList<String>();
		ArrayList<String> num1 = new ArrayList<String>();
		
		num.add("Pizza");
		num.add("Fuska");
		num.add("Biriyani");
		num.add("Burger");
		num.add("Ice cream");
		num.add("Noodles");
		num.add("Pasta");
		num.add("7 up");
		num.add("Singara");
		num.add("Somucha");
		
		 Scanner SC = new Scanner(System.in);
	        Random rand = new Random();
	        
	        
	        
	       
	       
	            int a= rand.nextInt(10);
	            System.out.println(a);
		
		num1.addAll(num); 
		
		//System.out.println(num);
		
		//num.remove(3);
		//num.clear();
		
		
		System.out.println("Traditional For Loop For Num: ");
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}
		
		System.out.println("Traditional For Loop For Num1: ");
	}}
	
	