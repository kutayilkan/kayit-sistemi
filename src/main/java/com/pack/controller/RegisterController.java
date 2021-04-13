package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.pack.model.Person;
import com.pack.service.ControllerService;


@Controller
public class RegisterController {
	
	@Autowired
	public ControllerService cs;
	
	//kayýt iþleminden önce yeni person nesnesi yaratma
	@RequestMapping(value ="/register", method = RequestMethod.GET)
	public ModelAndView openRegisterPage(HttpServletRequest request, HttpServletResponse response) {
		 
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("person",new Person());
		
		return mv;

	}
	
	//yaratýlan person nesnesinin özelliklerinin formdan atanmasý
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView registration(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("person") Person person) {
		
		cs.register(person);
		return new ModelAndView("kayittamamlandi", "isim", person.getIsim());
			
		}
	}
	

