package org.fasttrackit.salarii.service;

import org.fasttrackit.salarii.domain.Salary;
import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.exception.ResourceNotFoundException;
import org.fasttrackit.salarii.persistance.EmployeesRepository;
import org.fasttrackit.salarii.persistance.SalaryRepository;
import org.fasttrackit.salarii.transfer.Salary.AddEmployeesToSalary;
import org.fasttrackit.salarii.transfer.Salary.SaveSalaryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SalaryService.class);

    private final SalaryRepository salaryRepository;
    private final EmployeesRepository employeesRepository;
    private final EmployeesService employeesService;

    @Autowired
    public SalaryService(SalaryRepository salaryRepository, EmployeesService employeesService, EmployeesRepository employeesRepository) {

        this.salaryRepository = salaryRepository;
        this.employeesService = employeesService;
        this.employeesRepository = employeesRepository;
    }


    public Salary createSalary(AddEmployeesToSalary addEmployeesToSalary, SaveSalaryRequest request) {
        LOGGER.info("Create salary: ", addEmployeesToSalary);



        Employees employee = employeesRepository.findByMarca(request.getMarca());

        if (employee == null) {
            throw new ResourceNotFoundException("Not found employee: " + request.getMarca());
        }

        Salary salary = salaryRepository.findByEmployeesId(employee.getId());

        if (salary == null) {
            Salary salary1 = new Salary();

            LOGGER.info("salary doesnt exist");
            salary1.setEmployees(employee);
            salary1.setId(employee.getId());

            salary1.setWorkingdaysmonth(request.getWorkingdaysmonth());
            salary1.setWorkeddays(request.getWorkeddays());
            salary1.setHolidaydays(request.getHolidaydays());
            salary1.setSickdays(request.getSickdays());
            salary1.setWithoutsalarydays(request.getWithoutsalarydays());

            salary1.setRightworkeddays(request.getWorkeddays() * (employee.getSalary() / request.getWorkingdaysmonth()));
            salary1.setRightholidaydays(request.getHolidaydays() * (employee.getSalary() / request.getWorkingdaysmonth()));
            salary1.setRightsickdays(request.getSickdays() * (employee.getSalary() / request.getWorkingdaysmonth()));
            salary1.setbrutincome(request.getRightsickdays() + request.getRightholidaydays() + request.getWorkeddays());
            salary1.setCAS(request.getBrutincome() * 25 / 100);
            salary1.setCASS(request.getBrutincome() * 10 / 100);
            salary1.setTaxable(request.getBrutincome() - request.getCAS() - request.getCASS());
            salary1.setTax(request.getTaxable() * 16 / 100);
            salary1.setRighttikets(request.getWorkeddays() * employee.getTiket());
            salary1.setNetincome(request.getTaxable() - request.getTax() - request.getRighttikets());

            salaryRepository.save(salary1);
        }
        return salary;
    }


    public Salary getSalary(long id) {
        LOGGER.info("Retrievied clocking : {} ", id);
        return salaryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found salary for " + id));
    }

    public Salary updateSalary(long id, SaveSalaryRequest request) {
        LOGGER.info("Update salary for {}: {}", id, request);

        Salary salary = getSalary(id);
        BeanUtils.copyProperties(request, salary);
        return salaryRepository.save(salary);
    }

    public void deleteSalary(long id) {
        LOGGER.info("Deleting clocking : {}", id);
        salaryRepository.deleteById(id);
    }
}
