package classes;

public abstract class Person {
	
	private String name;
	
	public Person() {
		this.name = "Anonim";
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
