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

import np.edu.nast.nast.entities.Parent;
import np.edu.nast.nast.repository.ParentRepository;


@Controller
@RequestMapping("/parent")
public class ParentController {
	@Autowired
	private ParentRepository parentRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("parentList", parentRepo.findAll());
		return "parent-list";
	}
	@GetMapping("/create")
	public String createNotice(Model model){
		model.addAttribute("parentForm", new Parent());
		return "add-parent";
	}

	@PostMapping("/saveChanges")
	public String saveParent(@ModelAttribute("parentForm") Parent today, BindingResult result){
		parentRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("parentForm",parentRepo.getOne(id));
		return "add-parent";

	}
}