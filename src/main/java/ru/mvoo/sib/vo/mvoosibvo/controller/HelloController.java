package ru.mvoo.sib.vo.mvoosibvo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}
