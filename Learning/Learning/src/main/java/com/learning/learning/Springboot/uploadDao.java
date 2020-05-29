package com.learning.learning.Springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface uploadDao extends CrudRepository<filePojo, Integer>{
  
}
