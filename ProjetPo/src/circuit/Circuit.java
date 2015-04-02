package circuit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import composant.Composant;
import composant.ComposantElementaire;
import ports.Port;
import ports.PortIn;
import ports.PortOut;

public class Circuit {
	
	private HashMap<Integer,Composant> composants;
	
	private int numeroComposant;
	
	public Circuit() {
		composants = new HashMap<Integer,Composant>();
		numeroComposant = 1;
	}
	
	public void ajouterComposant(Composant comp) {
		composants.put(numeroComposant++, comp);
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
		if(p1 instanceof PortOut && p1.getConnect() == false) {
			p2 = p1;
		}
		if(p2 instanceof PortOut && p2.getConnect() == false){
			p1 = p2;
		}
	}
	
	public void resetCircuit(){
		composants.clear();
		numeroComposant = 1;
	}
	
	public void calcul(){
		for(Entry<Integer, Composant> entry : composants.entrySet()) {
		    Integer id = entry.getKey();
		    Composant comp = entry.getValue();
		    System.out.println(id + " " + ((ComposantElementaire) comp).getPout()[1].getValue());
		    ((ComposantElementaire) comp).fonction();
		    System.out.println(id + " " + ((ComposantElementaire) comp).getPout()[1].getValue());
		    if(comp instanceof composant.Led) {
		    	System.out.print("La led " + id + " est ");
		    	((composant.Led)comp).affichageEtat();
		    }
		}
	}
}