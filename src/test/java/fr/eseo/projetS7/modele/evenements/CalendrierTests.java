package fr.eseo.projetS7.modele.evenements;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalendrierTests {
	
	Calendrier testInstance;
	
	@Before 
	public void setUp() {
		List<Matchs> calendrierMatchs = new ArrayList<Matchs>();
		//Entrainements entrainement = new Entrainements("Lac de maine", "20h", "Rugby", "Mardi");
		List<Entrainements> calendrierEntrainements = new ArrayList<Entrainements>();
		testInstance = new Calendrier(calendrierMatchs, calendrierEntrainements);
	}
	
	@Test
	public void testAjouterMatch() {
		Matchs match = new Matchs("La Baumette", "19h", "Rugby", "27/01", "ESEO", "ENSAM");
		testInstance.ajouterMatch(match);
		List<Matchs> result = testInstance.calendrierMatchs;
		Assert.assertEquals("Should be one", 1, result.size());
	}

}
