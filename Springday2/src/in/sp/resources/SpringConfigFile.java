package in.sp.resources;

import java.beans.BeanProperty;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId() {
		Student student=new Student();
		student.setEmail("baba@gmail.com");
		student.setName("baba");
		student.setRollno(123);
		
		return student;
		
	}
	
	@Bean("aisehi")
	public Student kuchbhiStudent() {
		Student student=new Student();
		student.setEmail("a@gmail.com");
		student.setName("a");
		student.setRollno(1673);
		
		return student;
	}
	 
}
