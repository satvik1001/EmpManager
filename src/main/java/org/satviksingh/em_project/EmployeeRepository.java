package org.satviksingh.em_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//here we use  jpa which is java persistence api , with the help of jpa we easily interact with database with write a query..

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    
}
