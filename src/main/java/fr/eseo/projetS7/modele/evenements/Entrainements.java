package fr.eseo.projetS7.modele.evenements;

/**
 * 
 * Création des entrainements 
 * 
 * @author godefroi 
 *
 */

public class Entrainements {
	
	String lieu;
	String horaire;
	String sport;
	String date;
	
	public Entrainements(String lieu, String horaire, String sport, String date) {
		super();
		this.lieu = lieu;
		this.horaire = horaire;
		this.sport = sport;
		this.date = date;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getHoraire() {
		return horaire;
	}

	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Entrainements [lieu=" + lieu + ", horaire=" + horaire + ", sport=" + sport + ", date=" + date + "]";
	}

}
