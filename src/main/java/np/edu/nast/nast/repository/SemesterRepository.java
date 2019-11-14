package np.edu.nast.nast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.nast.entities.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Long> {

}
