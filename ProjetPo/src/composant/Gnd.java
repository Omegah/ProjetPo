package composant;

import ports.PortOut;

public class Gnd extends ComposantElementaire{

	private PortOut portOut;
	
	public Gnd(int idComp) {
		super(0,1,idComp);	
	}
	
	public void fonction() {
		this.Pout[1].setValue(false);
	}
	
}
