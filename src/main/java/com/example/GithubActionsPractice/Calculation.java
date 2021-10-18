package com.example.GithubActionsPractice;

import org.springframework.stereotype.Component;

@Component
public class Calculation {

    public int doSum(int num1 , int num2){
        return num1+num2;
    }
}
