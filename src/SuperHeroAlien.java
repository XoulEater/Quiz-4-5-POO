
public class SuperHeroAlien extends SuperHero{
	private String planet;
	private String species;
	
	public SuperHeroAlien(String Pname, int Page, String Phistory, String Pplanet, String Pspecies) {
		super(Pname, Page, Phistory);
		this.planet = Pplanet;
		this.species = Pspecies;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
}
