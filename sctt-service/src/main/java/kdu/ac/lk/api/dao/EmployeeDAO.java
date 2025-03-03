package kdu.ac.lk.api.dao;


import kdu.ac.lk.api.model.Employee;
import kdu.ac.lk.api.model.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Sidath", "Weerasinghe", "sidath.weerasinghe@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }

    public Employee getMySelf(){

        return list.getEmployeeList().get(0);
    }

    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
