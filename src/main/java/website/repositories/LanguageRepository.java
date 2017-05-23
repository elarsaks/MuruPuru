package website.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import website.objects.Language;

/* Stores the list of Language entities */
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	/* Language language is used as a unique identifier to search trough list of languages*/
	List<Language> findByLanguage(String language);

}
