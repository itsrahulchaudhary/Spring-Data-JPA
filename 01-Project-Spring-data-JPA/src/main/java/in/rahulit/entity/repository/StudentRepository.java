package in.rahulit.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rahulit.entity.Student;

 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
