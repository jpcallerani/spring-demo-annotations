package com.br.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.br.springdemo.BaseballCoach;
import com.br.springdemo.TennisCoach;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TennisCoach coach1 = context.getBean("tennisCoach", TennisCoach.class);
		BaseballCoach coach2 = context.getBean("baseballCoach", BaseballCoach.class);
		TennisCoach coach3 = context.getBean("tennisCoach", TennisCoach.class);

		coach1.setName("Bia");
		coach3.setName("Joao");
		
		System.out.println(coach1.getName());
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getFortuneService().getFortune());
		System.out.println();
		System.out.println(coach3.getName());
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach3.getFortuneService().getFortune());

		context.close();
	}
}
