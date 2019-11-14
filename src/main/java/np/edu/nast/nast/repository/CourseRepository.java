package np.edu.nast.nast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.nast.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
