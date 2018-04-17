package com.mongode.girl.service;

import com.mongode.girl.domain.Girl;
import com.mongode.girl.enums.ResultEnum;
import com.mongode.girl.exception.GirlException;
import com.mongode.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class GirlService {
    
    @Autowired
    private GirlRepository girlRepository;
    
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(11);
        girlRepository.save(girlA);
        
        Girl girlB = new Girl();
        girlB.setCupSize("ABC");
        girlB.setAge(13);
        girlRepository.save(girlB);
    }
    
    
    public void getAge(Integer id) throws Exception {
        Optional<Girl> girl = girlRepository.findById(id);
        Integer age = girl.get().getAge();
        if (age < 10) {
            /* 返回 你还在上小学吧 */
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age >= 10 && age < 16) {
            /* 返回 你可能在上初中 */
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
    
    /**
     * 通过id查询女孩信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findById(id).get();
    }
}
