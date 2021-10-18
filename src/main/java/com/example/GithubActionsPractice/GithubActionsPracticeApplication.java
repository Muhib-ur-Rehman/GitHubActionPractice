package com.example.GithubActionsPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsPracticeApplication.class, args);
		Calculation cal = new Calculation();
		System.out.println(cal.doSum(2,2));
	}

}
