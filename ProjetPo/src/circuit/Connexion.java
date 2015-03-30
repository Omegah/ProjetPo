package circuit;

import ports.Port;
import ports.PortIn;
import ports.PortOut;

public class Connexion {
	private PortIn in;
	private PortOut out;
	
	public Connexion(PortIn p1, PortOut p2) {
		in = p1;
		out = p2;
		
		in.setConnect(true);
		out.setConnect(true);
		
		in.setValue(out.getValue());
	}
}
