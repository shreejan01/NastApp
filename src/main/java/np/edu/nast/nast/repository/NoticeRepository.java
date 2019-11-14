package np.edu.nast.nast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.nast.entities.Notice;

public interface NoticeRepository extends JpaRepository<Notice,Long>  {

}
