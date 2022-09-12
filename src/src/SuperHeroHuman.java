
public class SuperHeroHuman extends SuperHero {
	private String country;

	public SuperHeroHuman(String Pname, int Page, String Phistory, String Pcountry) {
		super(Pname, Page, Phistory);
		country = Pcountry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
