package week2.day1;

public class Calculator {
	 public void additionTwoNumber(int a ,int b) {
		 int c=a+b;
		 System.out.println(c);
	 }
	 public void subtractionTwoNumber(int e, int f) {
		  int c =e-f;
		  System.out.println(c);
	 }
	 public void multiplicationTwoNumber(double i ,double j) {
		 double c=i*j;
		 System.out.println(c);
	 }
	 public void divsionTwoNumber(float x,float y) {
		 float c=x/y;
		 System.out.println(c);
	 }
	 
	 	 
		 public static void main(String[] args) {
	 
		Calculator operation=new Calculator();
		operation.additionTwoNumber(1000,6000 );
	    operation.subtractionTwoNumber(30,20);
	    operation.multiplicationTwoNumber(50.00,55.555);
	    operation.divsionTwoNumber(50f,2.5f);
	   
		
		 }
}


