package com.mongode.girl.controller;

import com.mongode.girl.domain.Girl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlControllerTest {
    
    @Autowired
    private GirlController girlController;
    
//    @Autowired
//    private final AtomicReference<MockMvc> mvc = new AtomicReference<MockMvc>();
    
    @Test
    public void girlList() throws Exception {
        girlController.girlList();
    }

    @Test
    public void girlFindOne() {
        girlController.girlFindOne(2);
        Girl girl = new Girl();
        girl.setId(2);
        girl.setAge(20);
        girl.setMoney(2.6);
        girl.setCupSize("A");
        Assert.assertEquals(girl.getCupSize(), girlController.girlFindOne(2).getCupSize());
    }
    
//    @Test
//    public void girlList() throws Exception {
//        mvc.get().perform(MockMvcRequestBuilders.get("/girls")
//                .andExpect(MockMvcResultMatchers.status().isOk()));
//    }
}