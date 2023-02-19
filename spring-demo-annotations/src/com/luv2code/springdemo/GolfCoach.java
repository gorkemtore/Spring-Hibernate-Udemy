package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Listen to the sound of nature";
	}

}
