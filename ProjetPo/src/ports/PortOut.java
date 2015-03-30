package ports;

import java.util.LinkedList;

public class PortOut extends Port {
	
	public LinkedList<Port> ListOut ;

	public PortOut(int idComposant,int idPort) {
		super(idComposant, idPort);
		ListOut = new LinkedList<Port>();
	}

	@Override
	public Integer nbconnection() {
		// TODO Auto-generated method stub
		return ListOut.size();
	}

}
