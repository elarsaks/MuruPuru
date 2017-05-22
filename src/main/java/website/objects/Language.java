package website.objects;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Language {
	
	/* Defines language attributes
	 * Assigns automatically unique identifier to the Entity*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long languageId;
	private String language;
	
	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", language=" + language + ", pages=" + pages + "]";
	}

	/* Connects Language to the Page */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "language")
	private List<Page> pages;

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public Language() {}

	public Language(String language) {
		super();
		this.language = language;
	}
	
	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
