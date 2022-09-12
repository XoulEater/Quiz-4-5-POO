
public class SuperHeroArtificial extends SuperHero{
	private String model;
	private int ID;
	
	public SuperHeroArtificial(String Pname, int Page, String Phistory, String Pmodel, int PID) {
		super(Pname, Page, Phistory);
		model = Pmodel;
		ID = PID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
