package org.fasttrackit.salarii.service;

import org.fasttrackit.salarii.domain.Salary;
import org.fasttrackit.salarii.exception.ResourceNotFoundException;
import org.fasttrackit.salarii.persistance.SalaryRepository;
import org.fasttrackit.salarii.transfer.Salary.SaveSalaryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Salaryservice {

  private static final Logger LOGGER = LoggerFactory.getLogger(Salaryservice.class);

  private final SalaryRepository salaryRepository;

  @Autowired
    public Salaryservice(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }


    public Salary createSalary(SaveSalaryRequest request){
        LOGGER.info("Create clocking: ", request);
        Salary salary = new Salary();
        salary.setWorkingdaysmonth(request.getWorkingdaysmonth());
        salary.setWorkeddays(request.getWorkeddays());
        salary.setHolidaydays(request.getHolidaydays());
        salary.setSickdays(request.getSickdays());
        salary.setWithoutsalarydays(request.getWithoutsalarydays());
       // salary.setUnmotivateddays(request.getUnmotivateddays());
        return salaryRepository.save(salary);

    }


    public Salary getSalary(long id){
        LOGGER.info("Retrievied clocking : {} " ,id);
        return salaryRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found salary for " + id));
    }

    public Salary updateSalary(long id, SaveSalaryRequest request){
        LOGGER.info("Update salary for {}: {}",id,request);

        Salary salary = getSalary(id);
        BeanUtils.copyProperties(request,salary);
        return salaryRepository.save(salary);
    }
    public  void  deleteSalary(long id){
        LOGGER.info("Deleting clocking : {}", id);
        salaryRepository.deleteById(id);
    }
}
