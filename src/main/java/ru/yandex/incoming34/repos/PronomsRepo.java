package ru.yandex.incoming34.repos;

import java.util.List;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.incoming34.entities.Pronom;

@Repository
//@Table(name = "pronoms")
public interface PronomsRepo extends CrudRepository<Pronom, Long>{
	
	//Iterable<Pronom> findAll();
	
	

}
