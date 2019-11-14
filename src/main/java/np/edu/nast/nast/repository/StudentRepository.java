package np.edu.nast.nast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.nast.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
