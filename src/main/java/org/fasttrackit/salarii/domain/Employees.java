package org.fasttrackit.salarii.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employees {

@Id
@GeneratedValue
private  long id;
@NotNull
private long marca;
@NotNull
private  String firstName;
@NotNull
private  String lastName;
@NotNull
private  long salary;
@NotNull
private  int standardHours;
@NotNull
private  int personalDeduction;
@NotNull
private  long tiket;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getStandardHours() {
        return standardHours;
    }

    public void setStandardHours(int standardHours) {
        this.standardHours = standardHours;
    }

    public int getPersonalDeduction() {
        return personalDeduction;
    }

    public void setPersonalDeduction(int personalDeduction) {
        this.personalDeduction = personalDeduction;
    }

    public long getTiket() {
        return tiket;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", marca=" + marca +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", standardHours=" + standardHours +
                ", personalDeduction=" + personalDeduction +
                ", tiket=" + tiket +
                '}';
    }

    public void setTiket(long tiket) {
        this.tiket = tiket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        return id == employees.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
