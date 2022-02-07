package com.chester.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chester.stock.model.Material;


@RestController
@RequestMapping("/skock")
public class ControladorRestStock 
{
	
	//@Autowired
//	PetService petService;
	
	
	@GetMapping(value="/getMateriales", produces = "Application/JSON")
	public @ResponseBody  List<Material> getFullMateriales()
	{
		return null;
	}
	
	

}
