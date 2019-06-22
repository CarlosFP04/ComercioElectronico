package com.component.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.component.app.pojo.ComponentBody;
import com.component.app.pojo.ComponentResponse;
import com.google.gson.Gson;

@RestController
@RequestMapping("component")
@CrossOrigin
public class ApplicationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@PostMapping(path="/application",produces= "application/json")
	public ResponseEntity<?> databaseComponent(@Valid @RequestBody ComponentBody body, BindingResult result) {
		Map<String, Object> response = new HashMap<String, Object>();
		LOGGER.info("Errores: " + result.hasErrors());
		if (result.hasErrors()) {
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El atributo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		Gson gson = new Gson();
		
		double disponibility = Math.random();
		LOGGER.info("Numero generado: " + disponibility);
		
		ComponentResponse componentResponse = new ComponentResponse();

		componentResponse.setComponentName(body.getComponentName());
		componentResponse.setDisponibility(disponibility);
		
		return new ResponseEntity<>(gson.toJson(componentResponse), HttpStatus.OK);
		
	}

}