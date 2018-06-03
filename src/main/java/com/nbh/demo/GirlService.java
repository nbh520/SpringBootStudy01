package com.nbh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;

@Service
public class GirlService {

    @Autowired
    private GirlRepsitory girlRepsitory;

    @org.springframework.transaction.annotation.Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepsitory.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBBB");
        girlB.setAge(19);
        girlRepsitory.save(girlB);
    }
}
