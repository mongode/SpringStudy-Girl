package com.mongode.girl.controller;

import com.mongode.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
    
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
//    @RequestMapping(value = {"/say", "/spk"}, method = RequestMethod.POST)
//    @RequestMapping(value = {"/say", "/spk"})
//    public String say(@PathVariable("id") Integer id){
//        return "id:" + id;
//        return girlProperties.getCupSize();
//        return content;
//        return cupSize + age;
//        return "Hello Spring Boot!";
//}
    
    //    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "66") Integer myid) {
        return "id:" + myid;
    }
    
}
