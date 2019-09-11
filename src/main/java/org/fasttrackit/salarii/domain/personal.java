package org.fasttrackit.salarii.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class personal {

@Id
@GeneratedValue
private  long id;
@NotNull
private long marca;
@NotNull
private  String name;
@NotNull
private  long salar;
@NotNull
private  int norma;
@NotNull
private  int dedp;
@NotNull
private  double tiket;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalar() {
        return salar;
    }

    public void setSalar(long salar) {
        this.salar = salar;
    }

    public int getNorma() {
        return norma;
    }

    public void setNorma(int norma) {
        this.norma = norma;
    }

    public int getDedp() {
        return dedp;
    }

    public void setDedp(int dedp) {
        this.dedp = dedp;
    }

    public double getTiket() {
        return tiket;
    }

    public void setTiket(double tiket) {
        this.tiket = tiket;
    }

    @Override
    public String toString() {
        return "personal{" +
                "id=" + id +
                ", marca=" + marca +
                ", name='" + name + '\'' +
                ", salar=" + salar +
                ", norma=" + norma +
                ", dedp=" + dedp +
                ", tiket=" + tiket +
                '}';
    }
}
