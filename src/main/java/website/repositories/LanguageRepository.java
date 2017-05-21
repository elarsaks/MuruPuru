/*
 * This class acts as library, storing all the Language objects
 * 
 */

package website.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import website.objects.Language;

public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	/* Language language is used as a unique identifier to search trough list of languages*/
	List<Language> findByLanguage(String language);

}
