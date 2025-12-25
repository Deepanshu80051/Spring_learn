package in.sp.beans;

public class Student {
    private String name;
    private int rollno;
    private Address address;
    
    private Student(int rollno , String name,Address address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	
    
    public void display() {
    	System.out.println(name);
    	System.out.println(rollno);
    	System.out.println(address);
    }
    
    
}
