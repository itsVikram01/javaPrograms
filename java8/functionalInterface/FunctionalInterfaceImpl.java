package java_codes.java8.functionalInterface;

//Traditional approach : 
//implements Calculator 
//-- overriding method 
//-- create main method
//-- with reference of CalculatorImpl we provide implementation
/*
public class CalculatorImpl implements Calculator{	
	@Override
	public void switchOn() {
		System.out.println("Switch On");
	}	
	public static void main(String[] args) {
		CalculatorImpl clcImpl=new CalculatorImpl();
		clcImpl.switchOn();
	}
}
*/


//LAMBDA EXPRESSION
//Syntax : ()[parameter] ->[expression] {}[body]
/*
public class CalculatorImpl{
	public static void main(String[] args) {
		
		Calculator calculator = () -> { 
			System.out.println("Switch On");
		};
		calculator.switchOn();
		
	}
}
*/


public class FunctionalInterfaceImpl {
	public static void main(String[] args) {
		/*
		Calculator calculator=(input) -> System.out.println("Sum is : "+input);
		calculator.sum(100);
		*/
		
		FunctionalInterface functionalInterface=(i1, i2) -> {
			if (i2<i1) {
				throw new RuntimeException("message");
			} else {
				return i2-i1;				
			}
		};
		System.out.println(functionalInterface.substract(3, 13));
	}
}