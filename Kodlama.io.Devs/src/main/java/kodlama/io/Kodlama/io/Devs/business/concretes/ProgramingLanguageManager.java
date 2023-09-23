package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@Service // bu sınıf bir business nesnesidir
public class ProgramingLanguageManager implements ProgramingLanguageService {

	private ProgramingLanguageRepository programingLanguageRepository;
	
	@Autowired
	public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {

		this.programingLanguageRepository = programingLanguageRepository;
	}


	@Override
	public List<ProgramingLanguage> getAll() {
		// iş kuralları
		
		return programingLanguageRepository.getAll();
	}


	@Override
	public ProgramingLanguage getById(int id) {
		
		return programingLanguageRepository.getById(id);
	}


	@Override
	public void add(ProgramingLanguage programingLanguage) throws Exception {
	
		if (programingLanguage.getName() == null) {
			throw new Exception("Programlama dili boş geçilemez");
		}
				
		for (ProgramingLanguage currentProgramingLanguage : programingLanguageRepository.getAll()) {
			if(currentProgramingLanguage.equals(programingLanguage)) {
				throw new Exception("Programlama dili zaten mevcut!");
			}
		}
		
		
		programingLanguageRepository.add(programingLanguage);
	}


	@Override
	public void update(ProgramingLanguage programingLanguage) {

		programingLanguageRepository.update(programingLanguage);
	}


	@Override
	public void delete(int id) {
		programingLanguageRepository.delete(id);
		
	}

}
