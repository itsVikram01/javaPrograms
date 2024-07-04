package java_codes.java8.functionalInterface;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Comparator<T> {
	
    int compare(T o1, T o2);

}
