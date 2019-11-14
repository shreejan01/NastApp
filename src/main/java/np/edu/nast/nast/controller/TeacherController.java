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

import np.edu.nast.nast.entities.Teacher;
import np.edu.nast.nast.repository.TeacherRepository;

@Controller
@RequestMapping("/teacher")

public class TeacherController {
	@Autowired
	private TeacherRepository teacherRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("teacherList", teacherRepo.findAll());
		return "teacher-list";
	}
	
	@GetMapping("/create")
	public String createTeacher(Model model){
		model.addAttribute("teacherForm", new Teacher());
		return "add-teacher";
	}

	@PostMapping("/saveChanges")
	public String saveTeacher(@ModelAttribute("teacherForm") Teacher today, BindingResult result){
		teacherRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("teacherForm",teacherRepo.getOne(id));
		return "add-teacher";
	}
  
}
