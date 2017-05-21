/*
 * This class acts as library, storing all the Language objects
 * 
 */

package website.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import website.objects.Page;

public interface PageRepository extends CrudRepository<Page, Long> {
	
	/* Since Language and Page tables are joined:
	 * Language language is used as a unique identifier to search trough list of languages
	 * */
	List <Page> findByLanguage(String language);
}
