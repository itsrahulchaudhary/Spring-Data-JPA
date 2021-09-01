package in.rahulit;
import java.util.List;

 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.boot.test.context.SpringBootTest;

import in.rahulit.entity.Guardian;
import in.rahulit.entity.Student;
@SpringBootTest
public class StudentRepositoryTest {
	
	@Autowired
	private in.rahulit.entity.repository.StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		Student student = new Student();
		student.setFirstName("Ajay");
		student.setLastName("Kumar");
		student.setEmailId("ajay@gmail.com");
		//student.setGuardianName("AKK");
		//student.setGuardianMobile("12345");
		//student.setGuardianEmail("akk@gmail.com");
		
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
		Guardian guardian = new Guardian();
		guardian.setName("AKK");
		guardian.setEmail("akk@gmail.com");
		guardian.setMobile("12345");
		
		Student student = new Student();
		student.setFirstName("Vijay");
		student.setLastName("Kumar");
		student.setEmailId("vijay@gmail.com");
		student.setGuardian(guardian);
		
		studentRepository.save(student);
	}
	
	@Test
	public void printAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		System.out.println(findAll);
	}

}
