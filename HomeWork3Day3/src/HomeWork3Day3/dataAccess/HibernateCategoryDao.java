package HomeWork3Day3.dataAccess;

import HomeWork3Day3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " Category added to Database with Hibernate");		
	}

}
