package com.wilkhu.keeper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private Long id;
    @Column
    private String code;
    @Column
    private String number;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Phone() {
    }

    public Phone(String code, String number) {
        this.code = code;
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
