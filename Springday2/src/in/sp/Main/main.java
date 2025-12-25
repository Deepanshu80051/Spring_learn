package in.sp.Main;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class main {
	public static void main(String[] args)
 {
	
	   
	   ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	  
	   // jab bean k andar kuch na likhe tab
	   Student stdStudent=(Student) context.getBean("stdId");
	   stdStudent.display();
	   
	   // jab bean k andar kuch likho ge tab same name dena h
	   Student stud =(Student) context.getBean("aisehi");
	   stud.display();
}
}
