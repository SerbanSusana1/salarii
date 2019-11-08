package org.fasttrackit.salarii.transfer.Salary;

public class SaveSalaryRequest {


    private  long workingdaysmonth;
    private  long workeddays;
    private  long holidaydays;
    private  long sickdays;
    private  long withoutsalarydays;
    //private  long unmotivateddays;

    @Override
    public String toString() {
        return "SaveSalaryRequest{" +

                ", workingdaysmonth=" + workingdaysmonth +
                ", workeddays=" + workeddays +
                ", holidaydays=" + holidaydays +
                ", sickdays=" + sickdays +
                ", withoutsalarydays=" + withoutsalarydays +
                '}';
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


}


