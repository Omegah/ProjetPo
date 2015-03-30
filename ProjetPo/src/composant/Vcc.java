package composant;

public class Vcc extends ComposantElementaire{

	public Vcc() {
		super(0,1);	
	}
	
	public void fonction() {
		this.Pout[1].setValue(true);
	}
	
}
