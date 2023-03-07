package HomeWork3Day3;

import HomeWork3Day3.business.CategoryManager;
import HomeWork3Day3.business.CourseManager;
import HomeWork3Day3.business.TrainerManager;
import HomeWork3Day3.core.DataBaseLogger;
import HomeWork3Day3.core.FileLogger;
import HomeWork3Day3.core.ILogger;
import HomeWork3Day3.dataAccess.HibernateCategoryDao;
import HomeWork3Day3.dataAccess.HibernateCourseDao;
import HomeWork3Day3.dataAccess.HibernateTrainerDao;
import HomeWork3Day3.dataAccess.JdbcCategoryDao;
import HomeWork3Day3.dataAccess.JdbcTrainerDao;
import HomeWork3Day3.entities.Category;
import HomeWork3Day3.entities.Course;
import HomeWork3Day3.entities.Trainer;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course();
		Course course2 = new Course();
		Category category1 = new Category();
		Category category2 = new Category();
		Trainer trainer1 = new Trainer();
		Trainer trainer2 = new Trainer();

		course1.setId(1);
		course1.setCourseName("Java Course");
		course1.setPrice(150.0);

		course2.setId(2);
		course2.setCourseName("Java Course");
		course2.setPrice(1500.0);
		
		category1.setId(1);
		category1.setCategoryName("Category 1");

		category2.setId(2);
		category2.setCategoryName("Category 2");

		trainer1.setId(1);
		trainer1.setTrainerName("Ahmet");

		trainer2.setId(2);
		trainer2.setTrainerName("Alparslan");

		ILogger[] loggers = {new DataBaseLogger(),new FileLogger()};
		ILogger[] emptyLoggers = {};
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),emptyLoggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(),emptyLoggers);

		TrainerManager trainerManager = new TrainerManager(new HibernateTrainerDao(),loggers);
		TrainerManager trainerManager2 = new TrainerManager(new JdbcTrainerDao(),loggers);
			
		courseManager.add(course1);
		System.out.println("------------------------------------------------------------------------");
		//courseManager.add(course2);//Aynı isim olduğu için hata veriyor

		System.out.println("************************************************************************");
		
		categoryManager.add(category1);
		System.out.println("------------------------------------------------------------------------");
		categoryManager2.add(category2);
		
		System.out.println("************************************************************************");
		 
		trainerManager.add(trainer1);
		System.out.println("------------------------------------------------------------------------");
		trainerManager2.add(trainer2);
		
		System.out.println("************************************************************************");
	}

}
