package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CITY")
public class cityEntity {
   @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = ="sec_street")
    @SequenceGenerator(name="seq_street", sequenceName="seq_street", allocationSize=1)
       private Integer id;
   @Column(name="NAME", nullable=false, insertable = true,updatable=true)
    private String cityName;
   @Column(name="CITY_TYPE")
    private String city_type;
    @Column(name="FOUNDATION_DATE")
    private Date foundation_date;
    @Column(name="DESCRIPTION")
    private String descriptione;
    @Column(name="SQUARE")
    private double square;
    @Column(name="CAPITAL")
    private int capital;

    @Transient
    private Date createDate;

    public cityEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCity_type() {
        return city_type;
    }

    public void setCity_type(String city_type) {
        this.city_type = city_type;
    }

    public Date getFoundation_date() {
        return foundation_date;
    }

    public void setFoundation_date(Date foundation_date) {
        this.foundation_date = foundation_date;
    }

    public String getDescriptione() {
        return descriptione;
    }

    public void setDescriptione(String descriptione) {
        this.descriptione = descriptione;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
