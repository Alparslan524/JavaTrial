package HomeWork3Day3.business;

import java.util.ArrayList;
import java.util.List;

import HomeWork3Day3.core.ILogger;
import HomeWork3Day3.dataAccess.ICourseDao;
import HomeWork3Day3.entities.Course;

public class CourseManager implements ICourseService {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	private List<Course> courses = new ArrayList<>();

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {

		
		if (course.getPrice() < 0) {
			throw new Exception("Course price cannot be a less zero: " + course.getPrice());
		}

		for (Course tempCourse : courses) {
			if (tempCourse.getCourseName() == course.getCourseName()) {
				throw new Exception("Course name already exist: " + course.getCourseName());
			}
		}
		courseDao.add(course);
		courses.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
