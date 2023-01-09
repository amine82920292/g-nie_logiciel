package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.DossierBancaire;

public class TestsCompteCourant {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompteCourant() {
		CompteCourant cc = new CompteCourant();
		assertEquals(0,cc.get_solde(),0.01);			
	}
	
	
	
	@Test
	public void deposer() {
		CompteCourant cc = new CompteCourant();
		cc.Deposer(1000);
		assertEquals(1000,cc.get_solde(),0.01);		
	}
	// on a voulu ajouter un test qui ne marche pas 
	@Test
	public void deposerfail() {
		CompteCourant cc = new CompteCourant();
		cc.Deposer(1000);
		cc.Deposer(10);
		if(cc.get_solde()!=1000);	
			fail("ce n'est pas le bon montant");
	}
}
