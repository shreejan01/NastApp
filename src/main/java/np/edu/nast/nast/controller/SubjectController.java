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

import np.edu.nast.nast.entities.Subject;
import np.edu.nast.nast.repository.SubjectRepository;



@Controller
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	private SubjectRepository subjectRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("subjectList", subjectRepo.findAll());
		return "subject-list";
	}
	@GetMapping("/create")
	public String createSubject(Model model){
		model.addAttribute("subjectForm", new Subject());
		return "add-subject";
	}

	@PostMapping("/saveChanges")
	public String saveSubject(@ModelAttribute("subjectForm") Subject today, BindingResult result){
		subjectRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("subjectForm",subjectRepo.getOne(id));
		return "add-subject";

	}
}