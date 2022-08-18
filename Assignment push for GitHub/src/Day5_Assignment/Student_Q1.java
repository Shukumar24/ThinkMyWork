package Day5_Assignment;

public class Student_Q1 {

	   private String name;
	   private int id;
	   public Department dep;
	   
	   Student_Q1(){}
	   
	   public Student_Q1(String name, int id) {
		
		this.name = name;
		this.id = id;
		dep = new  Department("Information Technology");
	
	}

   @Override
	public String toString() {
		return "Name=" + name + ", Id=" + id + ", Department=" + dep ;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Q1 o = new Student_Q1("shubham", 310110);
	System.out.println(o);
	}

}

class Department{
	public String dept;

	public Department(String dept) {
	
		this.dept = dept;
	}

	@Override
	public String toString() {
		return  dept ;
	}
	
	
	
	
}