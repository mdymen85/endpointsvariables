package com.entrypoints.endpointsvariables.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
@ConditionalOnProperty(name = "application.entrypoints.enabled", havingValue = "true", matchIfMissing = false)
public class EntryPointsController implements IDelegate {

	@Autowired
	private StandinController standinController;
	
	@Override
	public String controllerMethod() {				
		
		return isDtwProcess() ? "dtw processed ou " + this.standinController.controllerMethod() : this.standinController.controllerMethod();
	}
	
	private boolean isDtwProcess() {
		return true;
	}
	
}
