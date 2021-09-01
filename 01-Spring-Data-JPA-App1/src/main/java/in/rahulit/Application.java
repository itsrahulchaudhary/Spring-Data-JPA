package in.rahulit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.rahulit.entity.UserEntity;
import in.rahulit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		// System.out.println(userRepository.getClass().getName());
		/*
		 * UserEntity entity = new UserEntity(); 
		 * entity.setUserId(101);
		 * entity.setUname("Ashok"); 
		 * entity.setEmail("ashok@gmail.com");
		 * entity.setAge(29);
		 * 
		 * userRepository.save(entity);
		 */
		
		System.out.println("------------Save List of entity----------");
		// List of entity
		UserEntity entity1 = new UserEntity();
		entity1.setUserId(102);
		entity1.setUname("Aman");
		entity1.setEmail("aman@gmail.com");
		entity1.setAge(19);

		UserEntity entity2 = new UserEntity();
		entity2.setUserId(103);
		entity2.setUname("Raman");
		entity2.setEmail("raman@gmail.com");
		entity2.setAge(20);

		UserEntity entity3 = new UserEntity();
		entity3.setUserId(104);
		entity3.setUname("Laxman");
		entity3.setEmail("lak@gmail.com");
		entity3.setAge(22);

		List<UserEntity> list = new ArrayList<UserEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);

		userRepository.saveAll(list);

		System.out.println("-------- Fetch one record from table--------");
		// Fetch one record from table
		Optional<UserEntity> findById = userRepository.findById(104);
		if (findById.isPresent()) {
			UserEntity userEntity = findById.get();
			System.out.println(userEntity);
		}

		System.out.println("----------Fetch Multiple record from table--------");
		// Fetch Multiple record from table
		List<Serializable> userId = Arrays.asList(102, 103, 104);
		Iterable<UserEntity> findAllById = userRepository.findAllById(userId);
		for (UserEntity ue : findAllById) {
			System.out.println(ue);
		}

		System.out.println("-----------Fetch All the record from table----------");
		// Fetch All the record from table
		Iterable<UserEntity> findAll = userRepository.findAll();
		for (UserEntity ue : findAll) {
			System.out.println(ue);
		}
		
		System.out.println("-----------Check record exist or not----------");
		// Check record exist or not
		boolean existsById = userRepository.existsById(102);
		System.out.println("Is record present with PK as 102 ? :: "+existsById);
		
		System.out.println("-----------Total record count from table----------");
		// Total record count from table
		long count = userRepository.count();
		System.out.println("Total record count :: "+count);
		
		System.out.println("-----------record deleted from table----------");
		// delete by Id
		userRepository.deleteById(103);
	}

}
