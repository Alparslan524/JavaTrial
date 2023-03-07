package HomeWork3Day3.business;

import java.util.ArrayList;
import java.util.List;

import HomeWork3Day3.core.ILogger;
import HomeWork3Day3.dataAccess.ICategoryDao;
import HomeWork3Day3.entities.Category;

public class CategoryManager implements ICategoryService {

	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> categories=new ArrayList<>();
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		
		for (Category tempCategory : categories) {
			if (tempCategory.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Category name already exist: " + category.getCategoryName());
			}
		}
		categories.add(category);
		categoryDao.add(category);
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
