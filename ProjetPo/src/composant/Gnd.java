package composant;

import ports.PortOut;

public class Gnd extends ComposantElementaire{

	private PortOut portOut;
	
	public Gnd() {
		super(0,1);	
	}
	
	public void fonction() {
		this.Pout[1].setValue(false);
	}
	
}
