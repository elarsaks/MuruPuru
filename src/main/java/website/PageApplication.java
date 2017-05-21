/*
 * This is a main application class that calls other classes.
 * 
 */

package website;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import website.objects.Language;
import website.objects.Page;
import website.repositories.LanguageRepository;
import website.repositories.PageRepository;

@SpringBootApplication
public class PageApplication {
	
	/* Writes the execution info to the console */
	private static final Logger log = LoggerFactory.getLogger(PageApplication.class);
	
	/* Runs the main application class */
	public static void main(String[] args) {
		SpringApplication.run(PageApplication.class, args);
	}
	
	/* Automatically creates REST service controllers*/
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/* Connects with Repositories*/
	@Bean
	public CommandLineRunner page(PageRepository pagerepository, LanguageRepository langrepository) {
		
		return (args) -> {
			log.info("save a starting data");
			
			
			/* Adds new Languages to repository*/
			langrepository.save(new Language("Estonian"));
			langrepository.save(new Language("Finnish"));
			langrepository.save(new Language("English"));
			
			/* Creates new Pages and adds them to repository.
			 * Adds language from language repository as a shared column in Pages and Languages*/
			pagerepository.save(new Page( "WEBI ARENDUS AGENTUUR", "KODU", "TEENUSED", "MEIST", "KONTAKT", "Responsive Web Pages", "Me ehitame personaalseid webi lehti väike ettevottetele ja eraiskutele."
					+ " Tehes teiega lähedalt koostööd, tagame, et tulemus vastab teie soovidele. Meie tehtud webi lehed sobivad ilusti koigile ekraanidele.", 
					"2016 aasta lopus asutatuna oleme me noor ettevotte, millel onkuhjaga energiat ja ambitsiooni et ennas toestada. Me suhtume oma tööse kvaliteet enne kvantiteeti motteviisiga, "
					+ "ning teeme mida armastame ja armastame mida teeme.", "Aaddress", "Kurkimäentie 19 G55 Helsinki Finland 09400", "Telefon", "+358 4070 8489", 
					"info@murupuru.com", "Jätke sonum", "E-Mail", "Tekst", "SAADA", langrepository.findByLanguage("Estonian").get(0)));
			
			
			pagerepository.save(new Page( "WEB DEVELOPMENT AGENCY", "HOME", "SERVICES", "ABOUT", "CONTACT", "Responsive Web Pages", "We build custom made websites for small businesses and individuals. "
					+ "Working closely with you, we make sure that the end result is what you want. Our websites are fully responsive and fit all the screens. ", "Established in late 2016, we are a young company with a ton of energy and ambition to prove ourselves."
							+ " With quality over quantity mindset, we are fully focused on exceeding our customers expectations. We love what we do and do what we love.", "Aaddress", "Kurkimäentie 19 G55 Helsinki Finland 09400", "PHONE", "+358 4070 8489",
							"info@murupuru.com", "Leave a message", "E-Mail", "Text", "Send",  langrepository.findByLanguage("English").get(0)));
			
			pagerepository.save(new Page( "VERKKOSIVU KEHITYS TOIMISTO", "KOTI","PALVELUT", "MEISTÄ", "YHTEYTTÄ", "Resoniivset verkkosivut", "Me teemme verkkosivuja pieniyritykksille ja henkilöille."
					+ " Tehdän teidän kanssa tiivistä yhteitöitä takaamme, että tulos vastaa tarkka teidän toivolle. Meidän verkkosivut näytävät hienoltä kaikillä näytoillä.", 
					"Perustettu 2016 vuoden lopulla, olemme me nuori yritys mille kunnianhimoinen yritys, jolla on runsaasti kunniahimo ja energia todistadaa itsea. Me teemme mitä me rakastamme ja rakastamme mitä teemme.", 
					"Aaddress", "Kurkimäentie 19 G55 Helsinki Suomi 09400", "Puhelin",  "+358 4070 8489", "info@murupuru.com", "Jätke viesti", "Sähköposti", "Teksti", "Lähettä", langrepository.findByLanguage("Finnish").get(0)));
			
			/* Writes all the pages from page repository to console*/
			log.info("Get all pages");
			for (Page page : pagerepository.findAll()) {
				log.info(page.toString());
			}

		};
	}
}
