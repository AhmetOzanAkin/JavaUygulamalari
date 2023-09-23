package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {

	List<ProgramingLanguage> getAll();
	ProgramingLanguage getById(int id);
	void add(ProgramingLanguage programingLanguage);
	void update(ProgramingLanguage programingLanguage);
	void delete(int id);

}
