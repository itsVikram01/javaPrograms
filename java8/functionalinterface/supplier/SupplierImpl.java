package java_codes.java8.functionalinterface.supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierImpl {
	/*
	implements Supplier<String> {

	@Override
	public String get() {
		return "Hello Vikram";
	}
	*/
	
	public static void main(String[] args) {
		/*
		Supplier<String> supplier=new SupplierImpl();
		System.out.println(supplier.get());
		*/
		
		/**
		Supplier<String> supplier = () ->  "Hello Vikram";		
		System.out.println(supplier.get());
		**/
		List<String> list1=Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(() ->  "Hello Vikram"));
	}

}
