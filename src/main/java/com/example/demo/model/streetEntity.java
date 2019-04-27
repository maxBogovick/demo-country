package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="STREET")
public class streetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_counter")
    @SequenceGenerator(name="seq_counter", sequenceName = "sec_counter", allocationSize = 50)
    private Integer id;
    @Column(name="HOUSE")
    private String house;
    @Column(name="CITY_ID")
    private int city_id;
    @Column(name="STREET_NAME")
    private String street_name;

    public streetEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }
}
