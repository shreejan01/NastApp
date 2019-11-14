package np.edu.nast.nast.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import np.edu.nast.nast.entities.Program;
import np.edu.nast.nast.repository.ProgramRepository;

@Controller
@RequestMapping("/program")
public class ProgramController {
	@Autowired
	private ProgramRepository programRepo;
	
	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("programList",programRepo.findAll());
		return"program-list";
	}
	
	@GetMapping("/create")
	public String createProgram(Model model){
		model.addAttribute("programForm", new Program());
		return "add-program";
	}
   
	@PostMapping("/saveChanges")
	public String saveProgram(@ModelAttribute("programForm") Program today, BindingResult result){
		programRepo.save(today);
		System.out.println(today);
		return "redirect:list";
	}
	
	@GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") Long id, Model model){
		System.out.println(id);
		model.addAttribute("programForm", programRepo.getOne(id));
		return "update";
	}
	
	@PostMapping("/update/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model,@Valid Program today, BindingResult result){
		today.setProgramId(id);
		
		programRepo.save(today);
		
		model.addAttribute("programForm", programRepo.findAll());
		System.out.println(today);
		return "redirect:/program/list";
	}
	
}
