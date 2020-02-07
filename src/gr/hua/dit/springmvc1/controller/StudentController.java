package gr.hua.dit.springmvc1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.springmvc1.dao.StudentDAO;
import gr.hua.dit.springmvc1.entity.Student;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;
	
    @RequestMapping("/update-info")
    public String listStudents(Model model) {
            
            List<Student> students = studentDAO.getStudents();
            
            model.addAttribute("students",students);
            
            return "update-info";
    }    
	
    @RequestMapping("do-update")
    public String doUpdate() {
    	return "do-update";
    }
    
}

