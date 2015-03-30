package composant;

public class Vcc extends ComposantElementaire{

	public Vcc(int idComp) {
		super(0,1,idComp);	
	}
	
	public void fonction() {
		this.Pout[1].setValue(true);
	}
	
}
