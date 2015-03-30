package composant;

import ports.*;

public class Et extends ComposantElementaire {

	private PortIn portInUn;
	private PortIn portInDeux;
	private PortOut portOut;
	
	public Et(int idComp) {
		portInUn= new PortIn(idComp,1);
		portInDeux= new PortIn(idComp,2);
		portOut = new PortOut(idComp,3);
	}
	
	public void fonction() {
		if((portInUn.getValue()==true) && (portInDeux.getValue()==true))
			portOut.setValue(true);
		else
			portOut.setValue(false);	
	}
		
}
