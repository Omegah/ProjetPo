package tests;

import ports.Port;
import composant.*;
import circuit.Circuit;

public class TestComposant {

	public static void main(String[] args) {
		
		Circuit circuit = new Circuit();
		Gnd g1 = new Gnd();
		Gnd g2 = new Gnd();
		Vcc v1 = new Vcc();
		Et e1 = new Et();
		Non n1 = new Non();
		Ou o1 = new Ou();
		Led l1 = new Led();
		
		circuit.ajouterComposant(g1);
		circuit.ajouterComposant(g2);
		circuit.ajouterComposant(v1);
		circuit.ajouterComposant(e1);
		circuit.ajouterComposant(n1);
		circuit.ajouterComposant(o1);
		circuit.ajouterComposant(l1);
		
		(Port)(e1.getPin()[1]) = (Port)(g1.getPout()[1]);
		
		/*g1.fonction();
		circuit.connecter(g1.getPout()[1], e1.getPin()[1]);
		v1.fonction();
		circuit.connecter(v1.getPout()[1], e1.getPin()[2]);
		e1.fonction();
		g2.fonction();
		circuit.connecter(g2.getPout()[1], n1.getPin()[1]);
		n1.fonction();
		circuit.connecter(e1.getPout()[1], o1.getPin()[1]);
		circuit.connecter(n1.getPout()[1], o1.getPin()[2]);
		o1.fonction();
		circuit.connecter(o1.getPout()[1], l1.getPin()[1]);
		l1.fonction();
		l1.affichageEtat();*/
		//circuit.calcul();
		
		
	}

}
