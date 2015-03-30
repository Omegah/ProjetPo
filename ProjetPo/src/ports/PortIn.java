package ports;

public class PortIn extends Port {

	public PortIn(int idPort) {
		super(idPort);
	}

	@Override
	public Integer nbconnection() {
		// TODO Auto-generated method stub
		if(this.getConnect()==true)
			return 1;
		else
			return 0;
	}

}
