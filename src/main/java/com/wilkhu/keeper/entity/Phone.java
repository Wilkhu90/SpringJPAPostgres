package com.wilkhu.keeper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "phone")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Phone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phone_id")
    private Long id;
    @Column
    private String code;
    @Column
    private String number;
    @JsonIgnore
    @JoinColumn(name = "address_id")
    @ManyToOne(cascade = CascadeType.ALL)
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
