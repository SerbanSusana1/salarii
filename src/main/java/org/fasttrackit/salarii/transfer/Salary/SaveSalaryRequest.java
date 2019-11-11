package org.fasttrackit.salarii.transfer.Salary;

public class SaveSalaryRequest {


    private  long marca;
    private  long workingdaysmonth;
    private  long workeddays;
    private  long holidaydays;
    private  long sickdays;
    private  long withoutsalarydays;
    //private  long unmotivateddays;
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

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SaveSalaryRequest{" +
                "marca=" + marca +
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
                '}';
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

    public long getBrutincome() {
        return brutincome;
    }

    public void setBrutincome(long brutincome) {
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

    public void setWithoutsalarydays(long withoutsalarydays)
    {
        this.withoutsalarydays = withoutsalarydays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaveSalaryRequest request = (SaveSalaryRequest) o;

        if (workingdaysmonth != request.workingdaysmonth) return false;
        if (workeddays != request.workeddays) return false;
        if (holidaydays != request.holidaydays) return false;
        if (sickdays != request.sickdays) return false;
        if (withoutsalarydays != request.withoutsalarydays) return false;
        if (rightworkeddays != request.rightworkeddays) return false;
        if (rightholidaydays != request.rightholidaydays) return false;
        if (rightsickdays != request.rightsickdays) return false;
        if (brutincome != request.brutincome) return false;
        if (CAS != request.CAS) return false;
        if (CASS != request.CASS) return false;
        if (netincome != request.netincome) return false;
        if (righttikets != request.righttikets) return false;
        if (tax != request.tax) return false;
        return taxable == request.taxable;

    }

    @Override
    public int hashCode() {
        int result = (int) (workingdaysmonth ^ (workingdaysmonth >>> 32));
        result = 31 * result + (int) (workeddays ^ (workeddays >>> 32));
        result = 31 * result + (int) (holidaydays ^ (holidaydays >>> 32));
        result = 31 * result + (int) (sickdays ^ (sickdays >>> 32));
        result = 31 * result + (int) (withoutsalarydays ^ (withoutsalarydays >>> 32));
        result = 31 * result + (int) (rightworkeddays ^ (rightworkeddays >>> 32));
        result = 31 * result + (int) (rightholidaydays ^ (rightholidaydays >>> 32));
        result = 31 * result + (int) (rightsickdays ^ (rightsickdays >>> 32));
        result = 31 * result + (int) (brutincome ^ (brutincome >>> 32));
        result = 31 * result + (int) (CAS ^ (CAS >>> 32));
        result = 31 * result + (int) (CASS ^ (CASS >>> 32));
        result = 31 * result + (int) (netincome ^ (netincome >>> 32));
        result = 31 * result + (int) (righttikets ^ (righttikets >>> 32));
        result = 31 * result + (int) (tax ^ (tax >>> 32));
        result = 31 * result + (int) (taxable ^ (taxable >>> 32));
        return result;
    }
}


