package java_codes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralDAO {

	public static List<GeneralEntities> getEntities(){
		List<GeneralEntities> entities=new ArrayList<>();
		entities.add(new GeneralEntities(101, "Java", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")));
		entities.add(new GeneralEntities(102, "Spring", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")));
		entities.add(new GeneralEntities(103, "SpringBoot", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")));
		entities.add(new GeneralEntities(104, "Hibernat", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")));
		
		return entities;		
	}

	public static List<GeneralEntities> getAll() {
		return Stream.of(
				new GeneralEntities(101, "Java", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")),
				new GeneralEntities(102, "Spring", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")),
				new GeneralEntities(103, "SpringBoot", "abc@gmail.com", Arrays.asList("1234567890", "9876543210")),
				new GeneralEntities(104, "Hibernat", "abc@gmail.com", Arrays.asList("1234567890", "9876543210"))				 	
		).collect(Collectors.toList());
		
	}
}
