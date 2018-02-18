package com.wilkhu.keeper.dao;

import com.wilkhu.keeper.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneDao extends JpaRepository<Phone, Long> {
}
