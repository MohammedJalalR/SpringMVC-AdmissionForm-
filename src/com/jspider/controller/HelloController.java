package com.jspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/google")
public class HelloController {

     @RequestMapping("/gmail")
	public ModelAndView remote() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("msg", "QSpiders");
		modelandview.setViewName("Form");
		return modelandview;
	}
     @RequestMapping("/calculator")
 	public ModelAndView calculator() {
 		ModelAndView modelandview = new ModelAndView();
 		modelandview.addObject("msg", "Calculator");
 		modelandview.setViewName("Calculator");
 		return modelandview;
     }
     
	@PostMapping("/yahoo")
	public ModelAndView marker(@RequestParam("studentName")String name,@RequestParam("studentHobby")String hobby) {
		ModelAndView modelandview = new ModelAndView();
		Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		modelandview.addObject("student",student);
		modelandview.setViewName("HelloPage");
		return modelandview;
	}

}