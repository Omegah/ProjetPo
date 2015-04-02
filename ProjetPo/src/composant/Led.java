package composant;

public class Led extends ComposantElementaire{
	
	private boolean etat;
	
	public Led() {
		super(1,0);	
		}
	
	public void fonction() {
		etat = this.getPin()[1].getValue();
	}
	
	public void affichageEtat() {
		if(etat)
			System.out.println("allumée");
		else
			System.out.println("éteinte");
	}
}
