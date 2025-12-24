package in.sp.main;

import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
    	
    	     String config_loc="/in/sp/resources/app;ocationContext.cxml";
		ApplicationContext context= new ClassPathXmlApplicationContext(config_loc);
		
		Student s=context.getBean("stdId");
		s.display();
	}
}
