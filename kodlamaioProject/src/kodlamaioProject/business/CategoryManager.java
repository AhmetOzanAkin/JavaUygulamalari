package kodlamaioProject.business;

import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.dataAccess.CategoryDao;
import kodlamaioProject.entities.Category;

public class CategoryManager {
	// iş kurallarımız buraya yazılır.
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	
	public void add(Category category) throws Exception {
		
	for (Category categories : categories) {
		if(categories.getName().equals(category.getName())) {
			throw new Exception("Kategori ismi aynı girilemez");
		}
	}
		
		categoryDao.add(category);
		for (Logger logger: loggers) {
			logger.log(category.getName());
		}
	}
}
