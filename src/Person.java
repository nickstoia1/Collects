
public class Person implements Comparable<Person>{

	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
