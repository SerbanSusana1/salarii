package org.fasttrackit.salarii.transfer.Salary;

import javax.validation.constraints.NotNull;

public class AddEmployeesToSalary {

    @NotNull
    private  long employeesId;

    public long getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(long employeesId) {
        this.employeesId = employeesId;
    }

    @Override
    public String toString() {
        return "AddEmployeesToSalary{" +
                "employeesId=" + employeesId +
                '}';
    }
}
