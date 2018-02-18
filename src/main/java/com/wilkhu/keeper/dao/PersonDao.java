package com.wilkhu.keeper.dao;

import com.wilkhu.keeper.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}
