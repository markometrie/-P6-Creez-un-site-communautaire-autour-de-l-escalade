package com.escalade.controllers;

import org.springframework.stereotype.Controller;

import Manager.VoiesManager;
@Controller
public class VoiesController extends AbstractController {
	
	private VoiesManager voiesManager = getManagerFactory().getVoiesManager();

}
