package kodlamaioProject.business;

import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.dataAccess.HibernateDao;
import kodlamaioProject.dataAccess.TeacherDao;
import kodlamaioProject.entities.Teacher;

public class TeacherManager {

	private TeacherDao teacherDao;
	private Logger[] loggers;
	
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		super();
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}

	public TeacherManager(TeacherDao teacherDao) {
		super();
		this.teacherDao = teacherDao;
	}

	public void add(Teacher teacher)  {
		

		teacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.log(teacher.getFirstName()+teacher.getLastName());
		}
		
	}
}
