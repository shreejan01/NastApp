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

import np.edu.nast.nast.entities.Notice;
import np.edu.nast.nast.repository.NoticeRepository;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeRepository noticeRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("noticeList", noticeRepo.findAll());
		return "notice-list";
	}
	@GetMapping("/create")
	public String createNotice(Model model){
		model.addAttribute("noticeForm", new Notice());
		return "add-notice";
	}

	@PostMapping("/saveChanges")
	public String saveNotice(@ModelAttribute("noticeForm") Notice today, BindingResult result){
		noticeRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){

		System.out.println(id);
		model.addAttribute("noticeForm",noticeRepo.getOne(id));
		return "add-notice";

	}

	@GetMapping("/notice")
	public String showNotice(Model model){
		model.addAttribute("noticeList", noticeRepo.findAll());
		return  "notice";
	}
}
