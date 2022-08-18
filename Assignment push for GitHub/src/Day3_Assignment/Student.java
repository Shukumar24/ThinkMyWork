package Day3_Assignment;

public class Student {
    private int id;
    private String name;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int a) {
		id= a;
	}
	
	public void setName(String b) {
		name= b;
	}
    
	public void displayData(int a, String b) {
		id=a;
		name=b;
		System.out.println(id);
		System.out.println(name);
		}
	
	public static void main(String[] args) {
	Student o1 = new Student();
	//o1.displayData(11474, "sanju");
	
	o1.setId(110);
	o1.setName("aditya");
	Student o2 = new Student();
  o2.setName(o1.getName());
  System.out.println(o2.getName());
	//System.out.println(id);
	//System.out.println(name);
	//o1.displayData(110, "aditya");
	
	
	}

}
