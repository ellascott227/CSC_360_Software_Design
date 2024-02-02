package sayHi;

public class Person {
	String fname;
	String lname;
	int age;
	/**
	 * @param fname - First Name
	 * @param lname - last Name
	 * @param age - age of person in years
	 */
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person: " + fname + " " + lname + " " + age;
	}
	
	public static void main(String[] args) {
		Person r = new Person("Romeo", "Mon", 15);
		
		System.out.println("R " + r);
	
	}
	
	public Person makePerson(Person that) throws UnderAgeException {
		if (age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		
		Person child = new Person(this.getFname(), that.getLname(), 0);
		return child;
	}
}
