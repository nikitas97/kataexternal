package gr.hua.dit.springmvc1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/login")
	public String showloginpage() {
	        return "Student-login";
	}
	
	@RequestMapping("/")
	public String showfirstpage() {
	        return "Student-index";
	}
	
	@RequestMapping("/form")
	public String showAbout() {
	        return "form";
	}
	
	@RequestMapping("/submit-form")
	public String submitForm() {
		return "submit-form";
	} 
	
	@RequestMapping("redirect:/student/update-info")
	public String getStudInfo() {
		return "update-info";
	}
	
	@RequestMapping("redirect:/student/update-info/do-update")
	public String doUpdate() {
		return "do-update";
	}
	
	@RequestMapping("redirect:/form/view-rank")
	public String viewRank() {
		return "view-rank";
	}
	
	
}
