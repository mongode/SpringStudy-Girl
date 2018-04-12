package com.mongode.girl.service;

import com.mongode.girl.domain.Girl;
import com.mongode.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
