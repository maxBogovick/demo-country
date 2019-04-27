package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COUNTRIES")
public class CountryEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_street")
    @SequenceGenerator(name = "seq_street", sequenceName = "seq_street", allocationSize = 1)
    private Integer id;

    @Column(name = "COUNTRY_NAME", nullable = false, insertable = true, updatable = true)
    private String countryName;

    @Column(name = "CAPITAL")
    private String capital;

    @Column(name = "MOTHER_TONGUE")
    private String mother_tongue;
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "CITY")
    private String city;
    @Column(name = "SQUARE")
    private double square;



    @Transient
    private Date createDate;

    public CountryEntity() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMother_tongue() {
        return mother_tongue;
    }

    public void setMother_tongue(String mother_tongue) {
        this.mother_tongue = mother_tongue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
