package HomeWork3Day3.dataAccess;

import HomeWork3Day3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " Course added to Database with Jdbc");
		
	}

}
