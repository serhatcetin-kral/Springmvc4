package com.techproedu3.springmvctutorial4;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {

	
	
	
	////////////// if we reomove extension (.jsp) we need to go application propertiess file 
	// which is under the src/main/resourse folde and type spring.mvc.view.suffix=.jsp
	//then don't forget remove the all extension(.jsp)
	
	//if you put your index file in the another folder you need to type spring.mvc.view.prefix=/views/
	//in the application properties file
	//1.way
//	@PostMapping("add")
//	public String sumOfNumbers(HttpServletRequest reg) {
//		
//		
//		int a=Integer.parseInt(reg.getParameter("n1"));
//		int b=Integer.parseInt(reg.getParameter("n2"));
//		
//		String name=reg.getParameter("n3");
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		HttpSession session=reg.getSession();
//		session.setAttribute("sumOfNum",sum);
//		session.setAttribute("difference", difference);
//		session.setAttribute("product", product);
//		session.setAttribute("division", division);
//		session.setAttribute("name", name);
//		
//		
//		return "result";
//		
//		
//	}	
	
	
	
	//2.way
//	@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,HttpSession session ) {
//		
//		
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		
//		session.setAttribute("sumOfNum",sum);
//		session.setAttribute("difference", difference);
//		session.setAttribute("product", product);
//		session.setAttribute("division", division);
//		session.setAttribute("name", name);
//		
//		
//		return "result";
//		
//		
//	}	
	//3.way
//	@RequestMapping("add")
//	public ModelAndView sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
//		
//		ModelAndView mw=new ModelAndView();
//		mw.setViewName("result");
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		mw.addObject("sumOfNum",sum);
//		mw.addObject("difference", difference);
//		mw.addObject("product", product);
//		mw.addObject("division", division);
//		mw.addObject("name", name);
//		
//		
//		return mw;
//		
//		
//	}
	
	
	//4.way
//	@RequestMapping("add")
//	public ModelAndView sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
//		
//		ModelAndView mw=new ModelAndView("result");
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//
//		mw.addObject("sumOfNum",sum);
//		mw.addObject("difference", difference);
//		mw.addObject("product", product);
//		mw.addObject("division", division);
//		mw.addObject("name", name);
//		
//		
//		return mw;
//		
//	}
	//5.way
//	@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,Model m) {
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//
//		m.addAttribute("sumOfNum",sum);
//		m.addAttribute("difference", difference);
//		m.addAttribute("product", product);
//		m.addAttribute("division", division);
//		m.addAttribute("name", name);
//		
//		
//		return "result";
//		
//		
//	}
	
	
	
	//6.way
//	@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,ModelMap mm) {
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//
//		mm.addAttribute("sumOfNum",sum);
//		mm.addAttribute("difference", difference);
//		mm.addAttribute("product", product);
//		mm.addAttribute("division", division);
//		mm.addAttribute("name", name);
//		
//		
//		return "result";
//		
//		
//	}
	
//	@GetMapping("list")
//	public String list(Model m){
//		
//		List<String> student=new ArrayList<>();
//		
//		student.add("serhat");
//		student.add("kemal");
//		student.add("david");
//		student.add("ali");
//		m.addAttribute("student",student);
//		return "result";
//		
//	}


	@RequestMapping("addStudents")
	public String addStudents(@RequestParam("id") int id,@RequestParam("name") String name,
			@RequestParam("grade") int grade,@RequestParam("address") String address,
			@RequestParam("phone") int phone,Model m) {
		
		
		Students student=new Students(id,name,grade,address,phone);
		
		
		m.addAttribute("studentAdd",student);
		
		return "result";
		
	
	}

	

	
	
	
	
}
