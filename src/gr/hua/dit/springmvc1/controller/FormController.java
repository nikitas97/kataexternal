package gr.hua.dit.springmvc1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.springmvc1.dao.FormDAO;
import gr.hua.dit.springmvc1.entity.Form;

@Controller
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormDAO formDAO;
    
    @RequestMapping("/submit-form")
    public String Showsubmitform() {
		return "submit-form";
    	
    }
    
    @RequestMapping("view-rank")
    public String viewRank(Model model) {
    	
    	String result = formDAO.getForms();
    	
    	model.addAttribute("result", result);
    	
    	
    	return "view-rank";
    }
	
}
