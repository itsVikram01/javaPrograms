package java_codes.z_interview;

import java.util.List;
import java.util.Optional;

public class GeneralEntities {

	private int id;
	private String name;
	private String email;
	private List<String> phone;
	
	public GeneralEntities() {
		super();
	}

	public GeneralEntities(int id, String name, String email, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "GeneralEntities [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
}
