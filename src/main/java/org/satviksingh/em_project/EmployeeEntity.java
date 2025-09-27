package org.satviksingh.em_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//For Storing the data in database

@Data
@Entity
@Table(name="Employee_Entity")  //On changing the name of table the new table will be created in DB. 
public class EmployeeEntity {

          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
          private Long id;
          private String name; 
          private String phone;
          private String email;
}
