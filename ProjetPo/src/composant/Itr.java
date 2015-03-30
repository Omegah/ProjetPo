package composant;

public class Itr extends ComposantElementaire{
	
	protected boolean etat = false;

	public Itr(int idComp) {
		super(0,1,idComp);
	}

	public void fonction() {
		if (etat = false)
			this.Pout[1].setValue(false);
		else
			this.Pout[1].setValue(true);
	}

	public void switchState() {
		etat=!etat;
	}
}
