package Day5_Assignment;

public class Person_Q3 {
public int id;
public String name;
public Job job;


	
	public Person_Q3(int id, String name, Job job) {
	super();
	this.id = id;
	this.name = name;
	this.job = job;
	job= new Job(411042, "Devloper",new JoiningDate(9,"Aug",2022));
}



	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name  + job ;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person_Q3 o = new  Person_Q3(110,"Shubham Kumar",new Job(411042, "Devloper",new JoiningDate(9,"Aug",2022)));
             System.out.println(o); 
	}

}

class Job{
	public int jobId;
	public String profile;
	public JoiningDate joind;
	public Job(int jobId, String profile, JoiningDate joind) {
	       
		this.jobId = jobId;
		this.profile = profile;
		this.joind = joind;
	}
	@Override
	public String toString() {
		return " , JobId=" + jobId + ", Profile=" + profile + ", Joining Date=" + joind ;
	}
	
	
	
}

class JoiningDate {
	public int date;
	public String month;
	public int year;
	
	
	public JoiningDate(int date, String month, int year) {
	
		this.date = date;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return  date + ", Month=" + month + ", Year=" + year ;
	}
	
	
}