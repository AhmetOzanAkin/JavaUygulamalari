package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@RestController 
@RequestMapping("/api/programmingLanguages")
public class ProgramingLanguagesController {
	private ProgramingLanguageService programmingLanguageService;

	@Autowired
	public ProgramingLanguagesController(ProgramingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	} 

	@GetMapping("/getall")
	public List<ProgramingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	  @DeleteMapping("/delete")
	    public void delete(ProgramingLanguage programingLanguage){
	        programmingLanguageService.delete(programingLanguage.getId());
	    }

	

}
