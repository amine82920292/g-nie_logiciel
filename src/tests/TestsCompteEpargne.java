package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.CompteEpargne;

public class TestsCompteEpargne {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompteEpargne() {
		CompteEpargne ce = new CompteEpargne();
		assertEquals(0, ce.get_solde(), 0.01);
	}

	@Test
	public void deposer() {
		CompteEpargne ce = new CompteEpargne();
		ce.Deposer(1000);
		assertEquals(1000, ce.get_solde(), 0.01);
	}

	// on a voulu ajouter un test qui ne marche pas
	@Test
	public void deposerfail() {
		CompteEpargne ce = new CompteEpargne();
		ce.Deposer(1000);
		ce.Deposer(10);
		if (ce.get_solde() != 1000)
			;
		fail("ce n'est pas le bon montant");
	}

	@Test
	public void testgetTaux() {
		CompteEpargne ce = new CompteEpargne();
		assertEquals(3.2 / 100, ce.get_taux(), 0.01);
	}

	@Test
	public void testremunerer() {
		CompteEpargne ce = new CompteEpargne();
		ce.Deposer(500);
		assertEquals(500 * 0.032, ce.remunerer(), 0.01);

	}

}
