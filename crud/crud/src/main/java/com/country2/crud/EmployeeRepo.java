package com.country2.crud;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

}
