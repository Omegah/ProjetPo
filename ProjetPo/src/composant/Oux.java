package composant;

public class Oux extends ComposantElementaire{

	public Oux(int idComp) {
		super(2,1,idComp);
	}
	
	public void fonction() {
		if((this.getPin()[1].getValue()==true) ^ (this.getPin()[2].getValue()==true))
			this.getPout()[1].setValue(true);
		else
			this.getPout()[1].setValue(false);	
	}
}