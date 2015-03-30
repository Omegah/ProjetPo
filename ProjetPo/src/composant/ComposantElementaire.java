package composant;

import ports.PortIn;
import ports.PortOut;

public abstract class ComposantElementaire implements Composant{
	
	protected int idComposant;
	protected PortIn[] Pin;
	protected PortOut[] Pout;

	public ComposantElementaire(int Nentrees,int Nsorties,int idComp) {
		Pin= new PortIn[Nentrees+1];
		Pout= new PortOut[Nsorties+1];
		this.idComposant=idComp;

		for (int i=1;i<=Nentrees;i++)
			Pin[i]= new PortIn(idComp,i);
		
		for (int i=1;i<=Nsorties;i++)
			Pout[i]= new PortOut(idComp,i);

	}

	public int nbEntrees() {
		return Pin.length-1;	
	}
	
	public int nbSorties() {
		return Pout.length-1;	
	}
	
	public void fonction() {
	}

	public int getIdComposant() {
		return idComposant;
	}

	public PortIn[] getPin() {
		return Pin;
	}

	public PortOut[] getPout() {
		return Pout;
	}
	
}
