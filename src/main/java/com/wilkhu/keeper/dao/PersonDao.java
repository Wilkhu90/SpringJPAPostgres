package com.wilkhu.keeper.dao;

import com.wilkhu.keeper.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {
    @Modifying
    @Query(value = "update person set firstname = ?1, lastname=?2 where id = ?3", nativeQuery = true)
    int updateName(String firstname, String lastname, Long id);
}
