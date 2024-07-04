package java_codes.java8.functionalInterface.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateImpl {
		/*implements Predicate<Integer> {

	 @Override
	 public boolean test(Integer t) {
		 if (t % 2 == 0) {
			 return true;
		 } else {
			 return false;
		 }
	 }*/

	public static void main(String[] args) {
		/*Predicate<Integer> predicate = t -> t%2==0;
		System.out.println(predicate.test(8));*/

		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().filter(t -> t%2==0)
			.forEach(t -> System.out.println("Print Even : "+t));
	}

}
