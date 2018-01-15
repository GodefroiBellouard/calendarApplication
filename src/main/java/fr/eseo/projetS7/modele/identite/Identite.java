package fr.eseo.projetS7.modele.identite;

public class Identite {
	
	/**
	 * D�claration des variables nom et pr�nom qui constituent une identit� 
	 * 
	 */
	
	String nom;
	String prenom;
	
	/**
	 * COnstructeur d'une identit� d'un parieur ou d'un administrateur de calendrier 
	 * 
	 * @param nom
	 * @param prenom
	 */
	
	public Identite(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * Getters and setters 
	 * 
	 * @return
	 */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * M�thode toString
	 * 
	 */

	@Override
	public String toString() {
		return "Identite [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
