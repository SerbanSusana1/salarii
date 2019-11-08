package org.fasttrackit.salarii;


import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.exception.ResourceNotFoundException;
import org.fasttrackit.salarii.service.EmployeesService;
import org.fasttrackit.salarii.transfer.Employees.SaveEmployeesRequest;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionSystemException;

import javax.validation.constraints.NotNull;

//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesServiceIntegrationTests {

    @Autowired
    private EmployeesService employeesService;

    @Test
    public void testCreateEmployees_whenValidRequest_thenReturnCreateEmployees(){

        createEmployees();

    }


    @Test(expected = TransactionSystemException.class)
    public void testCreateEmployees_whenInvalidRequest_thenThrowException(){

        SaveEmployeesRequest request = new SaveEmployeesRequest();

        Employees employes = employeesService.createEmployees(request);
    }


    @Test
    public void testGetEmployees_whenExistingEmployees_thenReturnEmployees(){
        Employees createEmployees = createEmployees();

        Employees retriveEmployees = employeesService.getEmployees(createEmployees.getId());

        assertThat(retriveEmployees, notNullValue());
        assertThat(retriveEmployees.getId(), is(createEmployees.getId()));
        assertThat(retriveEmployees.getFirstName(), is(createEmployees.getFirstName()));
        assertThat(retriveEmployees.getLastName(), is(createEmployees.getLastName()));
        assertThat(retriveEmployees.getStandardHours(), is(createEmployees.getStandardHours()));
        assertThat(retriveEmployees.getSalary(), is(createEmployees.getSalary()));
        assertThat(retriveEmployees.getTiket(), is(createEmployees.getTiket()));
        assertThat(retriveEmployees.getPersonalDeduction(), is(createEmployees.getPersonalDeduction()));
        assertThat(retriveEmployees.getMarca(), is(createEmployees.getMarca()));
    }

    @Test( expected = ResourceNotFoundException.class)
    public  void testGetEmploees_whenNotExistingEmployees_thenThrowNotFoundException(){
        employeesService.getEmployees(888888);
    }

    @Test
    public  void updateEmployees_whenValidRequest_thenReturnUpdateEmployees(){

        Employees employees = createEmployees();
        SaveEmployeesRequest request=new SaveEmployeesRequest();
        request.setFirstName(employees.getFirstName()+"Muresan");
        request.setLastName(employees.getLastName()+"Ana");
        request.setSalary(employees.getSalary()+200);

        Employees updateEmployees = employeesService.updateEmployees(employees.getId(), request);

        assertThat(updateEmployees, notNullValue());
        assertThat(updateEmployees.getId(),is(employees.getId()));
        assertThat(updateEmployees.getFirstName(), is(request.getFirstName()));
        assertThat(updateEmployees.getLastName(), is(request.getLastName()));
        assertThat(updateEmployees.getSalary(), is(request.getSalary()));

    }

    private Employees createEmployees() {

        SaveEmployeesRequest request = new SaveEmployeesRequest();
        request.setMarca(1);
        request.setFirstName("Popescu");
        request.setLastName("Maria");
        request.setSalary(3000);
        request.setPersonalDeduction(300);
        request.setStandardHours(8);
        request.setTiket(19.5);

        Employees employees = employeesService.createEmployees(request);


        assertThat(employees, notNullValue());
        assertThat(employees.getId(), notNullValue());
        assertThat(employees.getId(), greaterThan(0L));
        assertThat(employees.getFirstName(),is(request.getFirstName()));
        assertThat(employees.getLastName(),is(request.getLastName()));
        assertThat(employees.getSalary(),is(request.getSalary()));
        assertThat(employees.getPersonalDeduction(),is(request.getPersonalDeduction()));
        assertThat(employees.getStandardHours(),is(request.getStandardHours()));
        assertThat(employees.getTiket(), is(request.getTiket()));

        return employees ;
    }


}
