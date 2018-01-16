package fr.eseo.projetS7.modele.paris;

import fr.eseo.projetS7.modele.evenements.Matchs;
import fr.eseo.projetS7.modele.identite.Identite;

public class ListeParis {
	
	Identite identite;
	int mise;
	Matchs match;
	
	public ListeParis(Identite identite, int mise, Matchs match) {
		super();
		this.identite = identite;
		this.mise = mise;
		this.match=match;
	}

}
