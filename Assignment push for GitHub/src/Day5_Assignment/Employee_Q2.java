package Day5_Assignment;

public class Employee_Q2 {

	     public String name;
	     public int id;
	     public int salary;
	     
	     public Mydate date;
	     public Dept  dept;
	     
	     public Employee_Q2(String name, int id, int salary) {
		
			this.name = name;
			this.id = id;
			this.salary = salary;
			date = new Mydate(28,"Febuary",2022);
			dept = new Dept("Shubham", 311042);
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




		public int getSalary() {
			return salary;
		}




		public void setSalary(int salary) {
			this.salary = salary;
		}




		public Mydate getDate() {
			return date;
		}




		public void setDate(Mydate date) {
			this.date = date;
		}




		public Dept getDept() {
			return dept;
		}




		public void setDept(Dept dept) {
			this.dept = dept;
		}




	@Override
		public String toString() {
			return "Name=" + name + ", Id=" + id + ", Salary=" + salary + ", Date=" + date + ", Department="
					+ dept ;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Q2 o = new Employee_Q2("Aditya",110, 45000);
		System.out.println(o);
	}

}

class Mydate{
	public int day;
	public String month;
	public int year;
	public Mydate(int day, String month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}
	
	
}

class Dept{
	  public String deptname;
	  public int id;
	public Dept(String deptname, int id) {
		
		this.deptname = deptname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Deptname=" + deptname + ", id=" + id ;
	}
	  
}