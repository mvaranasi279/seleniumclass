package com.iccbank.loans.carloans;

public class FirstClass {
		int a = 10, b= 12, c;
		
		public void addition()
		{
			c = a + b;
			System.out.println("Sum of a and b is : "+ c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		FirstClass x = new FirstClass();
		x.addition();
		
		FirstClass y = new FirstClass();
		y.addition();
	}

}
