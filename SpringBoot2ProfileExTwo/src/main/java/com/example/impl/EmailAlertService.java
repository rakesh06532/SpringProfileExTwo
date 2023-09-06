package com.example.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.service.AlertService;

@Component
@Profile("default")
public class EmailAlertService implements AlertService {

	@Override
	public void send(String msg) {
		System.out.println("From Mail Services: "+msg);

	}

}
