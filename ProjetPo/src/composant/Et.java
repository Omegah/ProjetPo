package composant;

import ports.*;

public class Et extends ComposantElementaire {

	private PortIn portInUn;
	private PortIn portInDeux;
	private PortOut portOut;
	
	public Et(int idComp) {
		super(2,1,idComp);
	}
	
	public void fonction() {
		if((this.getPin()[1].getValue()==true) && (this.getPin()[2].getValue()==true))
			this.getPout()[1].setValue(true);
		else
			this.getPout()[1].setValue(false);	
	}
		
}
