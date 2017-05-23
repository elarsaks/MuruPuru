package website.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import website.objects.Page;


/* Stores the list of Page entities */
public interface PageRepository extends CrudRepository<Page, Long> {
	
	/* Since Language and Page tables are joined:
	 * Language language is used as a unique identifier to search trough list of languages
	 * */
	List <Page> findByLanguage(String language);
}
