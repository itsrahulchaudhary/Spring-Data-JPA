package in.rahulit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.rahulit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable>{

	 

}
