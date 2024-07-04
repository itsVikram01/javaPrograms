package java_codes.java8.functionalInterface.consumer;

import java.util.Objects;

public interface Consumer<T> {
	
	// one abstract method
	void accept(T t); // Geneneric type doesn't return anything
	
	// one default method
	default Consumer<T> andThen(Consumer<? super T> after){
		Objects.requireNonNull(after);
		return (T t) -> { accept(t); after.accept(t); };
	}
	
}
