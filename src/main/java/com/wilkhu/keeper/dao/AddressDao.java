package com.wilkhu.keeper.dao;

import com.wilkhu.keeper.entity.Address;
import com.wilkhu.keeper.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressDao extends JpaRepository<Address, Long>{
    @Modifying
    @Query(value = "update address set country = ?1, city=?2 where address_id = ?3", nativeQuery = true)
    int updateAddress(String country, String city, Long id);
}
