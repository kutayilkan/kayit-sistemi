package com.pack.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pack.service.ControllerService;


@Controller
public class ListController {

	
	
	@Autowired
	ControllerService cs;
	
	//Listede kullanýlacak listeleme fonksiyonu
	@RequestMapping(value = "/listeleme", method=RequestMethod.GET)
	public ModelAndView listeleme(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv2 = new ModelAndView("listeleme");
		mv2.addObject("arraylist", cs.listeleme());
		return mv2;
	}
}
