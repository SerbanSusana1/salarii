package org.fasttrackit.salarii.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Salary {
    @Id
    private long id;
    private long marca;

    @NotNull
    private  long workingdaysmonth;
    private  long workeddays;
    private  long holidaydays;
    private  long sickdays;
    private  long withoutsalarydays;
  //  private  long unmotivateddays;
    private  long rightworkeddays;
    private  long rightholidaydays;
    private  long rightsickdays;
    private  long brutincome;
    private  long CAS;
    private  long CASS;
    private  long netincome;
    private  long righttikets;
    private  long tax;
    private  long taxable;


    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Employees employees;

    public Employees getEmployees() {
        return employees;
    }

    public long getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", marca=" + marca +
                ", workingdaysmonth=" + workingdaysmonth +
                ", workeddays=" + workeddays +
                ", holidaydays=" + holidaydays +
                ", sickdays=" + sickdays +
                ", withoutsalarydays=" + withoutsalarydays +
                ", rightworkeddays=" + rightworkeddays +
                ", rightholidaydays=" + rightholidaydays +
                ", rightsickdays=" + rightsickdays +
                ", brutincome=" + brutincome +
                ", CAS=" + CAS +
                ", CASS=" + CASS +
                ", netincome=" + netincome +
                ", righttikets=" + righttikets +
                ", tax=" + tax +
                ", taxable=" + taxable +
                ", employees=" + employees +
                '}';
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWorkingdaysmonth() {
        return workingdaysmonth;
    }

    public void setWorkingdaysmonth(long workingdaysmonth) {
        this.workingdaysmonth = workingdaysmonth;
    }

    public long getWorkeddays() {
        return workeddays;
    }

    public void setWorkeddays(long workeddays) {
        this.workeddays = workeddays;
    }

    public long getHolidaydays() {
        return holidaydays;
    }

    public void setHolidaydays(long holidaydays) {
        this.holidaydays = holidaydays;
    }

    public long getSickdays() {
        return sickdays;
    }

    public void setSickdays(long sickdays) {
        this.sickdays = sickdays;
    }

    public long getWithoutsalarydays() {
        return withoutsalarydays;
    }

    public void setWithoutsalarydays(long withoutsalarydays) {
        this.withoutsalarydays = withoutsalarydays;
    }


    public long getRightworkeddays() {
        return rightworkeddays;
    }

    public void setRightworkeddays(long rightworkeddays) {
        this.rightworkeddays = rightworkeddays;
    }

    public long getRightholidaydays() {
        return rightholidaydays;
    }

    public void setRightholidaydays(long rightholidaydays) {
        this.rightholidaydays = rightholidaydays;
    }

    public long getRightsickdays() {
        return rightsickdays;
    }

    public void setRightsickdays(long rightsickdays) {
        this.rightsickdays = rightsickdays;
    }

    public long getbrutincome() {
        return brutincome;
    }

    public void setbrutincome(long brutincome) {
        this.brutincome = brutincome;
    }

    public long getCAS() {
        return CAS;
    }

    public void setCAS(long CAS) {
        this.CAS = CAS;
    }

    public long getCASS() {
        return CASS;
    }

    public void setCASS(long CASS) {
        this.CASS = CASS;
    }

    public long getNetincome() {
        return netincome;
    }

    public void setNetincome(long netincome) {
        this.netincome = netincome;
    }

    public long getRighttikets() {
        return righttikets;
    }

    public void setRighttikets(long righttikets) {
        this.righttikets = righttikets;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public long getTaxable() {
        return taxable;
    }

    public void setTaxable(long taxable) {
        this.taxable = taxable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        return id == salary.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
