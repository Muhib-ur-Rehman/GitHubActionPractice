package com.example.GithubActionsPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculationTest {

    @Autowired
    Calculation calculation;

    @Test
    public void doSum(){
        Assertions.assertEquals(4,this.calculation.doSum(2,2));
    }
}
