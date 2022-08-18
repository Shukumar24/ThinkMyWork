package Day4_Assignment;

public class Student_Q12 {
	
            public String  name;
            public int age;
            public String address;
            
            public void set_info(String a, int b) {
            	name= a;
            	age= b;
            }
            
            public void set_info(String a, int b , String c) {
            	name= a;
            	age= b;
            	address= c;
            }
            
            
	@Override
			public String toString() {
				return "Name=" + name + ", Age=" + age + ", Address=" + address ;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student_Q12 o = new  Student_Q12();
		 o.set_info("Shubham", 23, "Pune");
	}

}
