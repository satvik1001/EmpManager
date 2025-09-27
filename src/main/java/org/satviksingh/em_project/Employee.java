package org.satviksingh.em_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //No need to generate getter and setter method
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
       
    private Long id;
    private String name;

  /*  public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }*/
    private String phone;
    private String email;



}
