package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.service.AlertService;

@Component
public class ProfileTestRunner implements CommandLineRunner {
	
	@Autowired
	private AlertService alert;

	@Override
	public void run(String... args) throws Exception {
		alert.send("Hello Users!");
	System.out.println("Welcome To Prifiles");

	}

}
