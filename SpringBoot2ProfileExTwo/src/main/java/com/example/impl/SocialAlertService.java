package com.example.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.service.AlertService;

@Component
@Profile("social")
public class SocialAlertService implements AlertService {

	@Override
	public void send(String msg) {
		System.out.println("From Social Service: "+msg);

	}

}
