package fr.eseo.projetS7.modele.paris;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import fr.eseo.projetS7.modele.evenements.Matchs;
import fr.eseo.projetS7.modele.identite.Identite;

public class Paris {
	
	Matchs match;
	int mise;
	Identite identite;
	
	
	Logger LOGGER = Logger.getLogger("Paris.java");
	
	/**
	 * Constructeur d'un paris à partir d'un match, d'une mise et d'une identite
	 * 
	 * @param match
	 * @param mise
	 * @param identite
	 */

	public Paris(Identite identite, Matchs match, int mise) {
		super();
		this.match = match;
		this.mise=mise;
		this.identite=identite;
	}
	
	/**
	 * Getters and setters
	 * 
	 * @return
	 */

	public Matchs getMatch() {
		return match;
	}

	public void setMatch(Matchs match) {
		this.match = match;
	}
	
	public int getMise() {
		return mise;
	}
	
	public void setMise(int mise) {
		this.mise=mise;
	}
	
	public Identite getIdentite() {
		return identite;
	}
	
	public void setIdentite(Identite identite) {
		this.identite=identite;
	}
	
	public Map<Identite,Integer> ajouterPointClassement(Identite identite,int mise) {
		Map<Identite,Integer> classement = new HashMap<Identite,Integer>();
		
		return classement;
	}
	
	/**
	 * Conversion du paris en String 
	 * 
	 */

	@Override
	public String toString() {
		return "Paris [match=" + match + ", mise=" + mise + "]";
	}


}
