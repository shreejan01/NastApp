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

import np.edu.nast.nast.entities.Semester;
import np.edu.nast.nast.repository.SemesterRepository;

@Controller
@RequestMapping("/semester")
public class SemesterController {
	@Autowired
	private SemesterRepository SemesterRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("semesterList", SemesterRepo.findAll());
		return "semester-list";
	}
	@GetMapping("/create")
	public String createSemester(Model model){
		model.addAttribute("semesterForm", new Semester());
		return "add-semester";
	}

	@PostMapping("/saveChanges")
	public String saveSemester(@ModelAttribute("semesterForm") Semester today, BindingResult result){
		SemesterRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("semesterForm",SemesterRepo.getOne(id));
		return "add-semester";

	}
}
