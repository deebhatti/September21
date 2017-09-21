package demo;

public class Calculator {
	public Calculator(){
		
	}
	
	public void add(int a , int b){  //a and b are called as Formal parameters/values
		System.out.println(a+b);
	}
	
	public void subtract(int a, int b){
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		Calculator basicCal = new Calculator();
		
		basicCal.add(20, 30);  //20 and 30 are actual parameters
		
		basicCal.add(5, 10);
		
		basicCal.add(60, 20);
		
		basicCal.subtract(50, 10);
	}

}
