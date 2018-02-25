package com.wilkhu.keeper.dao;

import com.wilkhu.keeper.entity.Address;
import com.wilkhu.keeper.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressDao extends JpaRepository<Address, Long>{

}
