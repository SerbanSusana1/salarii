package org.fasttrackit.salarii;

import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.domain.Salary;
import org.fasttrackit.salarii.service.EmployeesService;
import org.fasttrackit.salarii.service.SalaryService;
import org.fasttrackit.salarii.transfer.Employees.SaveEmployeesRequest;
import org.fasttrackit.salarii.transfer.Salary.AddEmployeesToSalary;
import org.fasttrackit.salarii.transfer.Salary.SaveSalaryRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SalaryServiceIntegrationTests {

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private SalaryService salaryService;

    @Test
    public void createSalaryTest_whenNewSalary_thenCreateSalary() {

        SaveSalaryRequest request2 = new SaveSalaryRequest();
        request2.setWorkingdaysmonth(22);
        request2.setWorkeddays(18);
        request2.setHolidaydays(7);
        request2.setSickdays(0);
        request2.setWithoutsalarydays(0);

//        SaveEmployeesRequest request = new SaveEmployeesRequest();
//        Employees employees = employeesService.createEmployees(request);

        AddEmployeesToSalary request1 = new AddEmployeesToSalary();
        request1.setEmployeesId(36);

        salaryService.createSalary(request1, request2);
    }
}

