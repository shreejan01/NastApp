package np.edu.nast.nast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import np.edu.nast.nast.entities.Student;
import np.edu.nast.nast.repository.StudentRepository;

@Controller
@RequestMapping("/student")
public class StudentController{

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("studentList", studentRepo.findAll());
		return "student-list";
	}
	
	@GetMapping("/Add")
	public String addStudent(Model model){
		model.addAttribute("studentForm", new Student());
		return "add-student";
	}

	@PostMapping("/saveChanges")
	public String saveStudent(@ModelAttribute("studentForm") Student today, BindingResult result){
		studentRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("studentForm",studentRepo.getOne(id));
		return "add-student";

	}
}





