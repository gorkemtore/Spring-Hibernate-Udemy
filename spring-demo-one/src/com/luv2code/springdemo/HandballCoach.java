package com.luv2code.springdemo;

public class HandballCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public HandballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice shooting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
