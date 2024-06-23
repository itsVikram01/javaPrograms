package java_codes.java8.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerImpl {
	/*implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);		
	}
*/
	public static void main(String[] args) {
		/*
		Consumer<Integer> consumer = t -> System.out.println("Print : "+t);
		consumer.accept(10);
		*/
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t -> System.out.println("Print : "+t));
	}
	
}
