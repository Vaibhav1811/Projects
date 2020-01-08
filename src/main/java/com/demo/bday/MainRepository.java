package com.demo.bday;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MainRepository extends CrudRepository<MainModel, Integer> {
	
	public static final String FIND_PROJECTS = "select * from testdb.check ";
	
	  @Query(value = FIND_PROJECTS, nativeQuery = true)
	    public List<MainModel> findProjects();

} 