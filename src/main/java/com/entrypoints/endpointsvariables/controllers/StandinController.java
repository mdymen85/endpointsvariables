package com.entrypoints.endpointsvariables.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class StandinController implements IDelegate {

	@Override
	public String controllerMethod() {
		return "standin process";
	}
	
}
