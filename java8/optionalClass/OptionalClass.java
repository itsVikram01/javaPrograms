package java_codes.java8.optionalClass;

import java_codes.java8.GeneralDAO;
import java_codes.java8.GeneralEntities;

import java.util.List;

public class OptionalClass {

	public static void main(String[] args) throws Exception {
		
		//GeneralEntities generalEntities = new GeneralEntities(101, "Java", null, Arrays.asList("1234567890", "9876543210"));
		
		//empty() : Optional<T> t=(Optional<T>) EMPTY; return t;
		//of() : if(obj==null){throw new NullPointerException();} return obj;
		//ofNullable() : return value == null ? empty() : of(value)
		
		//Optional<Object> emptyOptional = Optional.empty();
		//System.out.println(emptyOptional); //Exception in thread "main" java.lang.NullPointerException
		
		//Optional<String> ofOptional = Optional.of(generalEntities.getEmail());
		//System.out.println(ofOptional);
		
		//Optional<String> ofNullableOptional = Optional.ofNullable(generalEntities.getEmail());
		/*
		 * System.out.println(ofNullableOptional); if (ofNullableOptional.isPresent()) {
		 * System.out.println(ofNullableOptional.get()); }
		 * 
		 * System.out.println(ofNullableOptional.orElse("default@gmail.com"));
		 */
		getEntitiesByEmailId("abc");
	}
	
	// from db
	@SuppressWarnings("unlikely-arg-type")
	public static GeneralEntities getEntitiesByEmailId(String email) {
		List<GeneralEntities> entities=GeneralDAO.getEntities();
		return entities.stream()
		.filter(entity -> entity.getEmail().equals(email))
		.findAny()
		.get()
		//.orElse(new GeneralEntities())
		//.orElseThrow(() -> new Exception("no entities present"))
		;		
	}
	
}
