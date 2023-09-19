package kodlamaioProject;

import kodlamaioProject.business.CourseManager;
import kodlamaioProject.business.TeacherManager;
import kodlamaioProject.core.logging.DatabaseLogger;
import kodlamaioProject.core.logging.FileLogger;
import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.core.logging.MailLogger;
import kodlamaioProject.dataAccess.HibernateDao;
import kodlamaioProject.dataAccess.JdbcDao;
import kodlamaioProject.entities.Course;
import kodlamaioProject.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA)",1);
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)",1);
		
		if(course1.getName().equals(course2.getName()))
			throw new Exception("Kurs isimleri aynı olamaz");
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
		courseManager.add(course1);
		System.out.println("---------------------------------------------");

		courseManager.add(course2);
		
		System.out.println("---------------------------------------------");
		Teacher teacher1 = new Teacher("Engin","Demirog");
		Teacher teacher2 = new Teacher("Halit Enes"," Kalayci");
		TeacherManager teacherManager = new TeacherManager(new HibernateDao(),loggers);
		teacherManager.add(teacher1);
		System.out.println("---------------------------------------------");
		teacherManager.add(teacher2);
	}

}
