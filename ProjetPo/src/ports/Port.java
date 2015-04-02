package ports;

public abstract class Port implements IPort{

	protected Integer idComposant;
	protected Integer idPort;
	protected Boolean connect;
	protected Boolean value;
	
	public Port(int idPort) {
		this.idPort = idPort;	
		connect=false;
		value=false;
	}
	
	public abstract Integer nbconnection();

	public Integer getIdComposant() {
		return idComposant;
	}

	public void setIdComposant(Integer idComposant) {
		this.idComposant = idComposant;
	}

	public Integer getIdPort() {
		return idPort;
	}

	public void setIdPort(Integer idPort) {
		this.idPort = idPort;
	}

	public Boolean getConnect() {
		return connect;
	}

	public void setConnect(Boolean connect) {
		this.connect = connect;
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
