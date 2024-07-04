package java_codes.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List<Book> getBooks() {
		List<Book> books=new ArrayList<>();
		books.add(new Book(101, "Java"));
		books.add(new Book(101, "Hibernate"));
		books.add(new Book(101, "SpringBoot"));
		books.add(new Book(101, "MicroService"));
		return books;		
	}
}
