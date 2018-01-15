package fr.eseo.projetS7.modele.evenements;

public class Matchs {
	
	String lieu;
	String horaire;
	String sport;
	String date;
	String equipe1;
	String equipe2;
	
	public Matchs(String lieu, String horaire, String sport, String date, String equipe1, String equipe2) {
		super();
		this.lieu = lieu;
		this.horaire = horaire;
		this.sport = sport;
		this.date = date;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
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

	public String getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(String equipe1) {
		this.equipe1 = equipe1;
	}

	public String getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}

	@Override
	public String toString() {
		return "Matchs [lieu=" + lieu + ", horaire=" + horaire + ", sport=" + sport + ", date=" + date + ", equipe1="
				+ equipe1 + ", equipe2=" + equipe2 + "]";
	}

}
