package java_codes.java8.functionalinterface;


@FunctionalInterface
public interface Comparator<T> {
	
    int compare(T o1, T o2);

}
