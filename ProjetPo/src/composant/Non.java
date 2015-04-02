package composant;

public class Non extends ComposantElementaire{

	public Non() {
		super(1,1);	
	}

	public void fonction() {
		this.getPout()[1].setValue(!(this.getPin()[1].getValue()));
	}
}
