package java_codes.java8.functionalinterface;

public class MyClass<V, T> implements Runnable, Callable<V>, Comparable<T>, Comparator<T>,MyFunctionalInterface {

	// Runnable method
	@Override
	public void run() {
		
	}

	// Callable<V> method
	@Override
	public V call() throws Exception {
		return null;
	}

	//Comparable method
	@Override
	public int compareTo(T o) {
		return 0;
	}

	// Comparator<T> method
	@Override
	public int compare(T o1, T o2) {
		return 0;
	}

	//MyFunctionalInterface method
	@Override
	public void m1() {
		
	}

}
