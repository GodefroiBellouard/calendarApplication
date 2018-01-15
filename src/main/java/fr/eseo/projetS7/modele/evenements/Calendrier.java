package fr.eseo.projetS7.modele.evenements;

import java.util.List;
import java.util.logging.Logger;

public class Calendrier {
	
	/**
	 * 
	 * Logger pour afficher des messages, plus performant que le print de la classe System
	 * 
	 */
	
	Logger LOGGER = Logger.getLogger("Calendrier.java");
	
	/**
	 * 
	 * Déclaration des objets matchs et entrainements à ajouter ou supprimer du calendrier 
	 * 
	 */
	
	List<Matchs> calendrierMatchs;
	List<Entrainements> calendrierEntrainements;
	
	/**
	 * 
	 * Constructeur 
	 * 
	 * @param match
	 * @param entrainement
	 */
	
	public Calendrier(List<Matchs> calendrierMatchs, List<Entrainements> calendrierEntrainements) {
		super();
		this.calendrierMatchs=calendrierMatchs;
		this.calendrierEntrainements=calendrierEntrainements;
	}
	
	/**
	 * 
	 * Getters and setters 
	 * 
	 * @return
	 */
	
	public List<Matchs> getCalendrierMatchs() {
		return calendrierMatchs;
	}
	
	public void setCalendrierMatchs(List<Matchs> calendrierMatchs) {
		this.calendrierMatchs=calendrierMatchs;
	}
	
	public List<Entrainements> getCalendrierEntrainements() {
		return calendrierEntrainements;
	}
	
	public void setCalendrierEntrainements(List<Entrainements> calendrierEntrainements) {
		this.calendrierEntrainements=calendrierEntrainements;
	}
	
	/**
	 * Méthode pour ajouter un match au calendrier qui est sous forme de liste d'objets Matchs
	 * 
	 * @param match
	 */
	
	public void ajouterMatch(Matchs match) {
		if (matchEstVide(match)) {
			LOGGER.info("Il manque des information sur ce match. Impossible de l'ajouter au calendrier");
		} else {
			getCalendrierMatchs().add(match);
		}
	}
	
	/**
	 * Condition pour n'ajouter que les matchs ayant toutes les informations 
	 * 
	 * @return
	 */
	
	public boolean matchEstVide(Matchs match) {
		return (match.getDate().isEmpty() || match.getEquipe1().isEmpty() || 
				match.getEquipe2().isEmpty() || match.getHoraire().isEmpty() || 
				match.getLieu().isEmpty() || match.getSport().isEmpty());
	}
	
	/**
	 * 
	 * Méthode pour retirer un match, placé en paramètre de la liste
	 * 
	 * @param match
	 */
	
	public void retirerMatch(Matchs match) {
		if (calendrierMatchs.isEmpty()) {
			LOGGER.info("Le calendrier des matchs est vide. Impossible de retirer de matchs");
		} else {
			calendrierMatchs.remove(match);
		}
	}
	
	/**
	 * Méthode pour ajouter un entrainement à la liste du calendrier des entrainements 
	 * 
	 * @param entrainement
	 */
	public void ajouterEntrainement(Entrainements entrainement) {
		if (entrainementEstVide(entrainement)) {
			LOGGER.info("Il manque des information sur cet entrainement. Impossible de l'ajouter au calendrier");
		} else {
			getCalendrierEntrainements().add(entrainement);
		}
	}
	
	/**
	 * 
	 * Méthode de conditionnement de l'ajout d'un entrainement au calendrier. S'il manque des informations
	 * immpossible de l'ajouter. 
	 * 
	 * @param entrainement
	 * @return
	 */
	
	public boolean entrainementEstVide(Entrainements entrainement) {
		return (entrainement.getDate().isEmpty() || entrainement.getHoraire().isEmpty() 
				|| entrainement.getLieu().isEmpty() || entrainement.getSport().isEmpty());
	}
	
	/**
	 * Méthode pour retirer un entrainement de la liste. 
	 * 
	 * @param entrainement
	 */
	
	public void retirerEntrainement(Entrainements entrainement) {
		if (calendrierEntrainements.isEmpty()) {
			LOGGER.info("Le calendrier des entrainements est vide. Impossible de retirer l'entrainement");
		} else {
			calendrierEntrainements.remove(entrainement);
		}
	}
	
}
