package topic_8.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import topic_8.model.Course;

public interface CourseRepository extends MongoRepository<Course, Integer> {

	@Query(value = "{ assignedTeacher.idTeacher: ?0 }")
	public List<Course> findCoursesByTeacherId(Integer idTeacher);
}
