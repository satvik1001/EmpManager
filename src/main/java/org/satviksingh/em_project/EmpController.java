package org.satviksingh.em_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



//Controller is used to fetch the request and send the response to the user.

@RestController
public class EmpController {
  @Autowired
  EmployeeService employeeService;

    @GetMapping("employees") //endpoint to get all employees. with the help of postman
    public  List<Employee> getAllEmployees(){
       

      //  List<Employee> employees=new ArrayList<>();   
   /*  Employee emp=new Employee();
       emp.setName="Satvik";
       employees.add(emp);  */
      //  return employees;
      return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
     public Employee getEmployeeById(@PathVariable Long id){
    return employeeService.readEmployee(id);
       }
    

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {
      // employees.add(employee);//yeh kaam servoce ka hai
     return employeeService.createEmployee(employee);
     // return "Saved Suceesfully";
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id))
            return "Delete Successfully";
        return "Not Found";
    } 
 
    @PutMapping("employees/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
         return employeeService.updateEmployee(id,employee);
    }      
}
