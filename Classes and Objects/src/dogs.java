

public class dogs {
	
	private String breed;
	private String color;
	private int age;
	
	
	public String dog (String breed) {
		String dog;
		dog = breed;
		return breed;
	}

	
	public boolean age () {
		if (age>5);
		System.out.println ("Your dog is getting old.");
			return true;
	}
				
			
	public static void main(String[] args) {
		
	}
	
	/* Add constructors */

	public dogs() {
		super();
	}

	public dogs(String breed, String color) {
		super();
		this.breed = breed;
		this.color = color;
	}

	public dogs(String breed, String color, int age) {
		super();
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	/* Getters and Setters for all instance variables */

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
