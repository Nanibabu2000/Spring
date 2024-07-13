package com.satya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
@RequestMapping("/")
public String index() {
return"name"; 
}
@RequestMapping("/result")
public String printfullname(@RequestParam String fname,@RequestParam String lname,ModelMap model)
{
	model.put("k1",fname);
    model.put("k2",lname);
	String fullname=fname+""+lname;
	model.put("fullname",fullname);
	
	return"result";
}
}