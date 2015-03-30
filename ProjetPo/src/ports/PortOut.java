package ports;

import java.util.LinkedList;

public class PortOut extends Port implements IPortOut{
	
	public LinkedList<Port> ListOut ;

	public PortOut(int idPort) {
		super( idPort);
		ListOut = new LinkedList<Port>();
	}

	@Override
	public Integer nbconnection() {
		// TODO Auto-generated method stub
		return ListOut.size();
	}

}
