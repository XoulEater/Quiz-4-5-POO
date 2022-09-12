
public class SuperHero implements Technology, Artifacts, SuperPower {
	protected String name;
	protected int age;
	protected String history;
	
	public SuperHero(String Pname, int Page, String Phistory) {
		super();
		this.name = Pname;
		this.age = Page;
		this.history = Phistory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String getPower() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desactivate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTechnology() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void TurnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getArtifacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void equip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dequip() {
		// TODO Auto-generated method stub
		
	}
	
}
