package website.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pageId;
	private String slogan;
	private String home;
	private String services;
	private String about;
	private String contact;
	private String servicesH;
	private String servH;
	private String servTxt;
	private String aboutTxt;
	private String contactH;
	private String addressH;
	private String addressTxt;
	private String phoneH;
	private String phoneTxt;
	private String eMailTxt;
	private String message;
	private String eMail;
	private String text;
	private String btn;
	private String name;
	
	/* Connects Page to Language.
	 * LanguageId is a foreign key foreign key referencing Language Entity  */
	@ManyToOne
	@JoinColumn(name = "languageId")
	private Language language;
	
	public Page(){}

	public Page(String slogan, String home, String services, String about, String contact, String servicesH,String servH, String servTxt,
			String aboutTxt, String contactH ,String addressH, String addressTxt, String phoneH, String phoneTxt, String eMailTxt,
			String message, String eMail, String text, String btn, Language language, String name) {
		super();
		this.slogan = slogan;
		this.home = home;
		this.services = services;
		this.about = about;
		this.contact = contact;
		this.servicesH = servicesH;
		this.servH = servH;
		this.servTxt = servTxt;
		this.aboutTxt = aboutTxt;
		this.contactH = contactH;
		this.addressH = addressH;
		this.addressTxt = addressTxt;
		this.phoneH = phoneH;
		this.phoneTxt = phoneTxt;
		this.eMailTxt = eMailTxt;
		this.message = message;
		this.eMail = eMail;
		this.text = text;
		this.btn = btn;
		this.language = language;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Page [pageId=" + pageId + ", slogan=" + slogan + ", home=" + home + ", services=" + services
				+ ", about=" + about + ", contact=" + contact + ", servH=" + servH + ", servicesH=" + servicesH + ", servTxt=" + servTxt
				+ ", aboutTxt=" + aboutTxt + ", contactH=" + contactH + ", addressH=" + addressH + ", addressTxt=" + addressTxt + ", phoneH="
				+ phoneH + ", phoneTxt=" + phoneTxt + ", eMailTxt=" + eMailTxt + ", message=" + message + ", eMail="
				+ eMail + ", text=" + text + ", btn=" + btn + ", language=" + language.getLanguage() + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServicesH() {
		return servicesH;
	}

	public void setServicesH(String servicesH) {
		this.servicesH = servicesH;
	}

	public String getContactH() {
		return contactH;
	}

	public void setContactH(String contactH) {
		this.contactH = contactH;
	}

	public long getPageId() {
		return pageId;
	}

	public void setPageId(long pageId) {
		this.pageId = pageId;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getServH() {
		return servH;
	}

	public void setServH(String servH) {
		this.servH = servH;
	}

	public String getServTxt() {
		return servTxt;
	}

	public void setServTxt(String servTxt) {
		this.servTxt = servTxt;
	}

	public String getAboutTxt() {
		return aboutTxt;
	}

	public void setAboutTxt(String aboutTxt) {
		this.aboutTxt = aboutTxt;
	}

	public String getAddressH() {
		return addressH;
	}

	public void setAddressH(String addressH) {
		this.addressH = addressH;
	}

	public String getAddressTxt() {
		return addressTxt;
	}

	public void setAddressTxt(String addressTxt) {
		this.addressTxt = addressTxt;
	}

	public String getPhoneH() {
		return phoneH;
	}

	public void setPhoneH(String phoneH) {
		this.phoneH = phoneH;
	}

	public String getPhoneTxt() {
		return phoneTxt;
	}

	public void setPhoneTxt(String phoneTxt) {
		this.phoneTxt = phoneTxt;
	}

	public String geteMailTxt() {
		return eMailTxt;
	}

	public void seteMailTxt(String eMailTxt) {
		this.eMailTxt = eMailTxt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getBtn() {
		return btn;
	}

	public void setBtn(String btn) {
		this.btn = btn;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	

}