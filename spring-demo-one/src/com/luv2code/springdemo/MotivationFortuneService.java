package com.luv2code.springdemo;

import java.util.Random;

public class MotivationFortuneService implements FortuneService{
	
	Random rnd = new Random();
	String[] fortunes = new String[] {"You can do it", "Trust your progress", "Maybe you are not perfect but if you want to be perfect, try to be perfect"};
	
  	@Override
	public String getFortune() {
		
		return fortunes[rnd.nextInt(fortunes.length)];
		
	}

}
