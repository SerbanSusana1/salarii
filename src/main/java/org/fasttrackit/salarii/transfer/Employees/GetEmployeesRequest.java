package org.fasttrackit.salarii.transfer.Employees;

import javax.validation.constraints.NotNull;

public class GetEmployeesRequest {
    @NotNull
    private long marca;

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "GetEmployeesRequest{" +
                "marca=" + marca +
                '}';
    }
}
