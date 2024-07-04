package java_codes.java8.lambdaExpression;

import java.util.Collections;
import java.util.List;

public class BookService {

	// list of book in sorted order
	public List<Book> getSortedBook() {
		List<Book> books=new BookDAO().getBooks();
		
		//Collections.sort(books, new MyComparator());
		
		/*
		Collections.sort(books, new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
				
				//for ascending order
				//return o1.getName().compareTo(o2.getName());
				
				//for descending order
				return o2.getName().compareTo(o1.getName());
				
			}
		});
		*/
		
		/* 
		(o1, o2) -> o2.getName().compareTo(o1.getName());
		*/
		Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getSortedBook());
	}
}

/*
class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//for ascending order
		//return o1.getName().compareTo(o2.getName());
		
		//for descending order
		return o2.getName().compareTo(o1.getName());
	}
	
}
*/