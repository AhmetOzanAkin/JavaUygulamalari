package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@Repository // bu sınıf bir dataAccess nesnesidir.
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {

	List<ProgramingLanguage> programingLanguages;
	
	public InMemoryProgramingLanguageRepository() {

		programingLanguages = new ArrayList<ProgramingLanguage>();
		programingLanguages.add(new ProgramingLanguage(1,"C#"));
		programingLanguages.add(new ProgramingLanguage(2, "JAVA"));
		programingLanguages.add(new ProgramingLanguage(3, "Python"));
		
	}

	public InMemoryProgramingLanguageRepository(List<ProgramingLanguage> programingLanguage) {

		this.programingLanguages = programingLanguage;
	}

	

	@Override
	public List<ProgramingLanguage> getAll() {
		return programingLanguages;
	}

	@Override
	public ProgramingLanguage getById(int id) {
	
		for (ProgramingLanguage programingLanguage : programingLanguages) {
			if(programingLanguage.getId() == id) {
				return programingLanguage;
			}
			
		}return null;
		
	}

	@Override
	public void add(ProgramingLanguage programingLanguage) {
		 programingLanguages.add(programingLanguage);
		
	}

	@Override
	public void update(ProgramingLanguage programingLanguage) {
		ProgramingLanguage currentProgramingLanguage = getById(programingLanguage.getId());
		if(currentProgramingLanguage != null) {
			currentProgramingLanguage.setName(programingLanguage.getName());
		}
		
	}

	@Override
	public void delete(int id) {
		ProgramingLanguage removeProgramingLanguage = getById(id);
		if (removeProgramingLanguage != null) {
			programingLanguages.remove(removeProgramingLanguage);
		}
	}

}
