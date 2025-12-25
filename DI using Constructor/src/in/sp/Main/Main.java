package in.sp.Main;

import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
		
    	String locString="/in/sp/resources/applicationContext.xml";
    	ApplicationContext context=new ClassPathXmlApplicationContext(locString);
 
    Student stdStudent=(Student)	context.getBean("stdId");
    	stdStudent.display();
	}
}
