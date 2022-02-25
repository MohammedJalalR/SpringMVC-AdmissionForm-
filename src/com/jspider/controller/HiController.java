package com.jspider.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HiController {
	@RequestMapping("/Bingo")
	public ModelAndView remote() {
		ModelAndView modelandview = new ModelAndView("HiPage");
		modelandview.addObject("msg", "Nothing is impossible");
		return modelandview;
		
	}
}
