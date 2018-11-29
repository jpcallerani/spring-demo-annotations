package com.br.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.br.springdemo.BaseballCoach;
import com.br.springdemo.SportConfig;
import com.br.springdemo.TennisCoach;

public class JavaCofnigMyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
