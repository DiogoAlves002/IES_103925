package ex2.lab3.IES.Multilayerapplications.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ex2.lab3.IES.Multilayerapplications.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}