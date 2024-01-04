package new1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 0;
		int time = 0;
		double rot = 0.0;
		double simpleIntrest = 0.0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Amount");
		amount= sc.nextInt();
		
		System.out.println("Enter Time");
		time= sc.nextInt();
		
		System.out.println("Enter ROT");
		rot = sc.nextDouble();
		
		
		simpleIntrest = (amount*rot*time)/100;
		
		System.out.println("Simple Intrest is: "+ simpleIntrest);

	}

}
