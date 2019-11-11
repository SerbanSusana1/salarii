package org.fasttrackit.salarii.web;

import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.service.EmployeesService;
import org.fasttrackit.salarii.transfer.Employees.AddEmployeesRequest;
import org.fasttrackit.salarii.transfer.Employees.EmployeesResponse;
import org.fasttrackit.salarii.transfer.Employees.GetEmployeesRequest;
import org.fasttrackit.salarii.transfer.Employees.SaveEmployeesRequest;
import org.fasttrackit.salarii.transfer.Salary.AddEmployeesToSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @PostMapping
    public ResponseEntity<Employees> createEmployees(@RequestBody @Valid SaveEmployeesRequest request){

        Employees employees = employeesService.createEmployees(request);
        return new ResponseEntity<>(employees, HttpStatus.CREATED);
    }



    @GetMapping("/id")
    public ResponseEntity<Employees> getEmployees(@PathVariable("id") long id){
        Employees employees =employeesService.getEmployees(id);
        return  new  ResponseEntity<>(employees, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<Page<EmployeesResponse>> getEmployeess(GetEmployeesRequest request, Pageable pageable) {
        Page<EmployeesResponse> employees = employeesService.getEmployeess(request, pageable);
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }
    @PutMapping("/id")
    public ResponseEntity<Employees> updateEmployees
            (@PathVariable("id") long id, @RequestBody SaveEmployeesRequest request){
        Employees employees= employeesService.updateEmployees(id,request);
        return  new ResponseEntity<>(employees, HttpStatus.OK);

    }


    @DeleteMapping("/id")
    public ResponseEntity<Employees> deleteEmployees(@PathVariable("id") long id){
        employeesService.deleteEmployees(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
