package com.mongode.girl.controller;

import com.mongode.girl.domain.Girl;
import com.mongode.girl.repository.GirlRepository;
import com.mongode.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {
    
    @Autowired
    private GirlRepository girlRepository;
    
    @Autowired
    private GirlService girlService;
    
    /*
     * 查询所有Girl的列表
     * @return
     * */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }
    
    /**
     * 添加一个Girl
     * @param girls
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(Girl girls) {
        Girl girl = new Girl();
        girl.setCupSize(girls.getCupSize());
        girl.setAge(girls.getAge());
        
        return girlRepository.save(girl);
    }
    
    /**
     * 根据id查询Girl的信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findById(id);
    }
    
    /**
     * 根据id更新Girl的信息
     * @param id
     * @param girls
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id, Girl girls) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(girls.getAge());
        girl.setCupSize(girls.getCupSize());
        
        return girlRepository.save(girl);
    }
    
    /**
     * 根据id删除Girl的信息
     *
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }
    
    
    /**
     * 根据age查询Girl列表
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }
    
    @PostMapping(value = "/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }
    
}
