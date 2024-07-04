package java_codes.java8.functionalInterface;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	// single abstract method in interface
	void m1();  // convert this abstract method in anonymous function using lambda expression
	
	
	//multiple default and static method
	default void m2() {
		System.out.println("Default method");
	}
	
	default void m3() {
		System.out.println("Default method");
	}

	static void m4() {
		System.out.println("Static method");
	}
}
