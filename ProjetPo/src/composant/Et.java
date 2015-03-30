package composant;

import ports.*;

public class Et extends ComposantElementaire {

	private PortIn portInUn;
	private PortIn portInDeux;
	private PortOut portOut;
	
	public Et() {
		// TODO Auto-generated constructor stub
	}
	
	public void fonction() {
		if((portInUn.getValue()==true) && (portInDeux.getValue()==true))
			portOut.setValue(true);
		else
			portOut.setValue(false);	
	}
	
	
}
