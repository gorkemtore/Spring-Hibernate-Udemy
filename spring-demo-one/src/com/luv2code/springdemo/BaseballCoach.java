package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
