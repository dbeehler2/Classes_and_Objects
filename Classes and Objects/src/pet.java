
public class pet {
	
		
	private String name;
	private int age;
	private String location;
	private String type;
	
	public static void main (String[] args) {
		
	}
	
	/* Constructors */
	
	public pet() {
		this.name = "Default Name";
	}

	public pet(String name) {
		this.name = name;
			
	}
	
	public pet(String name, int age, String location, String type) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	/* Getters and Setters */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setLocation(String location) {
		this.location = location;
	}	
	
}




