package com.spring.test.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.test.StudentJDBCTemplate;

@Controller
public class WebAppController {
	   @GetMapping("/")
	   public String index() {
	      return "index";
	   }

	   @PostMapping("/result")
	   public String sayHello(@RequestParam("name") String name, @RequestParam("bday") String bday, @RequestParam("neptun") String neptun, Model model) {
	      model.addAttribute("name", name);
	      model.addAttribute("bday", bday);
	      model.addAttribute("neptun", neptun);
	      
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      studentJDBCTemplate.create(name, bday, neptun);
	      
	      return "result";
	   }
}
