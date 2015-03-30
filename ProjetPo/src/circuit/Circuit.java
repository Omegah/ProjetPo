package circuit;

import java.util.LinkedList;

import composant.Composant;
import ports.Port;
import ports.PortIn;
import ports.PortOut;

public class Circuit {
	
	private LinkedList<Composant> composants;
	private LinkedList<Connexion> connexions;
	
	public Circuit() {
		composants = new LinkedList<Composant>();
		connexions = new LinkedList<Connexion>();
	}
	
	public void ajouterComposant(Composant comp) {
		composants.add(comp);
		System.out.println("Composant " + comp.getClass() + " créé !" );
	}
	
	public void connecter(Port p1, Port p2) {
		if(p1 instanceof PortIn && p2 instanceof PortIn) {
			// ERROR
			System.out.println("Impossible de connecter les deux ports");
			System.out.println("-> Deux entrées !");
			return;
		}
		if(p1 instanceof PortOut && p2 instanceof PortOut) {
			// ERROR
			System.out.println("Impossible de connecter les deux ports");
			System.out.println("-> Deux sorties !");
			return;
		}
		if(p1.getIdComposant() == p2.getIdComposant()) {
			// ERROR
			System.out.println("Impossible de connecter les deux ports");
			System.out.println("-> Les deux ports appartiennent au même composant !");
			return;
		}
		if(p1 instanceof PortIn && p1.getConnect() == false) {
			connexions.add(new Connexion((PortIn)p1,(PortOut)p2));
		}
		if(p2 instanceof PortIn && p2.getConnect() == false){
			connexions.add(new Connexion((PortIn)p2,(PortOut)p1));
		}
	}
	
	public void resetCircuit(){
		composants.clear();
		connexions.clear();
	}
}