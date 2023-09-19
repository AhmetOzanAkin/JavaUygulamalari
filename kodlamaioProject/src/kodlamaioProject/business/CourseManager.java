package kodlamaioProject.business;

import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.dataAccess.CourseDao;
import kodlamaioProject.dataAccess.HibernateDao;
import kodlamaioProject.dataAccess.JdbcDao;
import kodlamaioProject.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;


	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception {

		
		
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatını 0 TL'den küçük olamaz");
		}
		
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
