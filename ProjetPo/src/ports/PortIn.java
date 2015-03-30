package ports;

public class PortIn extends Port implements IPortIn{

	public PortIn(int idComposant,int idPort) {
		super(idComposant, idPort);
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
