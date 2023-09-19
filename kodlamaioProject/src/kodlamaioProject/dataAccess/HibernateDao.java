package kodlamaioProject.dataAccess;

import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;
import kodlamaioProject.entities.Teacher;

public class HibernateDao implements TeacherDao,CategoryDao,CourseDao{

	public void add(Category category) {
		System.out.println("Kategori Hibernate ile veritabanına eklendi");
	}
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile veritabanına eklendi");

	}
	public void add(Teacher teacher) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi");
	}
}
