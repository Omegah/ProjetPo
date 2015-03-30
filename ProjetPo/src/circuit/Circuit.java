package circuit;

import java.util.LinkedList;

import composant.Composant;
import ports.Port;
import ports.PortIn;
import ports.PortOut;

public class Circuit {
	
	private LinkedList<Composant> composants;
	
	public Circuit() {
		composants = new LinkedList<Composant>();
	}
	
	public void ajouterComposant(Composant comp) {
		composants.add(comp);
	}
	
	public void connecter(Composant c1, Port p1, Composant c2, Port p2) {
		if(p1 instanceof PortIn && p2 instanceof PortIn) {
			//ERROR
			System.out.println("Impossible de connecter les deux ports");
			System.out.println("-> Deux entrées !");
		}
		if(p1 instanceof PortOut && p2 instanceof PortOut) {
			//ERROR
			System.out.println("Impossible de connecter les deux ports");
			System.out.println("-> Deux sorties !");
		}
		if(p1 instanceof PortIn && p2 instanceof PortOut) {
			p1 = p2;
		}
		if(p1 instanceof PortOut && p2 instanceof PortIn) {
			p2 = p1;
		}
	}
}