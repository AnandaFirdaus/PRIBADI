//ABSTRACT
public abstract class Person {
	//ACCESS MODIFIER
	protected String id;
	protected String name;

	
	//-	Constructor Overloading
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
	//constructor
	public Person() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
