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

import np.edu.nast.nast.entities.Faculty;
import np.edu.nast.nast.repository.FacultyRepository;

@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	private FacultyRepository facultyRepo;
	
	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("facultyList", facultyRepo.findAll());
		return "faculty-list";
	}
   
	@GetMapping("/create")
	public String createFaculty(Model model){
		model.addAttribute("facultyForm", new Faculty());
		return "add-faculty";
	}
	
	@PostMapping("saveChanges")
	public String saveFaculty(@ModelAttribute("facultyForm") Faculty today, BindingResult result){
		facultyRepo.save(today);
		System.out.println(today);
		return "redirect:list";
	}
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		System.out.println(id);
		model.addAttribute("facultyForm", facultyRepo.getOne(id));
		return "add-faculty";
	}
}
