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

import np.edu.nast.nast.entities.Course;
import np.edu.nast.nast.repository.CourseRepository;


@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseRepository courseRepo;

	@GetMapping("/list")
	public String index(Model model){
		model.addAttribute("courseList", courseRepo.findAll());
		return "course-list";
	}
	@GetMapping("/create")
	public String createCourse(Model model){
		model.addAttribute("courseForm", new Course());
		return "add-course";
	}

	@PostMapping("/saveChanges")
	public String saveCourse(@ModelAttribute("courseForm") Course today, BindingResult result){
		courseRepo.save(today);
		System.out.println(today);
		return"redirect:list"; 
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		
		System.out.println(id);
		model.addAttribute("courseForm",courseRepo.getOne(id));
		return "add-course";

	}
}
