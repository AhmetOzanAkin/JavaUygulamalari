package kodlamaioProject.dataAccess;

import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;
import kodlamaioProject.entities.Teacher;

public class JdbcDao implements TeacherDao,CategoryDao,CourseDao {

	//Dao = Data Access Object
	//Sadece ve sadece DB erişim kodları yazılır... SQL
	
	public void add(Category category) {
		System.out.println("Kategori JDBC ile veritabanına eklendi");
	}
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veritabanına eklendi");
	}
	public void add(Teacher teacher) {
		System.out.println("Eğitmen JDBC ile veritabanına eklendi");
	}
}
