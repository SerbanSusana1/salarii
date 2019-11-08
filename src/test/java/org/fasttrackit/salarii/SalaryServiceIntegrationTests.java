package org.fasttrackit.salarii;

import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.service.EmployeesService;
import org.fasttrackit.salarii.service.SalaryService;
import org.fasttrackit.salarii.transfer.Employees.SaveEmployeesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SalaryServiceIntegrationTests {

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private SalaryService salaryService;

@Test
 public void createSalaryTest_whenNewSalary_thenCreateSalary(){

     SaveEmployeesRequest request=new SaveEmployeesRequest();
     Employees employees = employeesService.createEmployees(request);

 }
}
