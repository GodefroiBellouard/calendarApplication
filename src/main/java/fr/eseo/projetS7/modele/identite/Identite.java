package fr.eseo.projetS7.modele.identite;

public class Identite {
	
	/**
	 * Déclaration des variables nom et prénom qui constituent une identité 
	 * 
	 */
	
	String nom;
	String prenom;
	
	/**
	 * COnstructeur d'une identité d'un parieur ou d'un administrateur de calendrier 
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
	 * Méthode toString
	 * 
	 */

	@Override
	public String toString() {
		return "Identite [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
