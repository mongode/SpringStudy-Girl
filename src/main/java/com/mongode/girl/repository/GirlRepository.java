package com.mongode.girl.repository;

import com.mongode.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
    
    /*通过年龄查询Girl列表*/
    List<Girl> findByAge(Integer age);
}
