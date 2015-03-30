package composant;

import ports.PortIn;
import ports.PortOut;

public abstract class ComposantElementaire implements Composant{
	
	protected PortIn[] Pin;
	protected PortOut[] Pout;

	public ComposantElementaire(int Nentrees,int Nsorties) {
		Pin= new PortIn[Nentrees+1];
		Pout= new PortOut[Nsorties+1];

		for (int i=1;i<=Nentrees;i++)
			Pin[i]= new PortIn(i);
		
		for (int i=1;i<=Nsorties;i++)
			Pout[i]= new PortOut(i);

	}

	public int nbEntrees() {
		return Pin.length-1;	
	}
	
	public int nbSorties() {
		return Pout.length-1;	
	}
	
	public void fonction() {
	}

	public PortIn[] getPin() {
		return Pin;
	}

	public PortOut[] getPout() {
		return Pout;
	}
	
}
