package com.wilkhu.keeper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address")
public class Address implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Phone> phone;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "person_id")
    private Person person;

    public Address() {
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString(){
        return "Address["+this.city+", "+this.country+"]";
    }
}
