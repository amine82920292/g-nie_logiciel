package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Before
	public void setUp() throws Exception {
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testdeposer() {
		
		
		DossierBancaire db = new DossierBancaire();
		db.deposer(500);
		assertEquals(500,db.get_solde(),0.01);		
		
	}
	
	@Test
	public void getsolde() {
		
		DossierBancaire db = new DossierBancaire();
		assertEquals(0,db.get_solde(),0.01);	
		db.deposer(500);
		assertEquals(500,db.get_solde(),0.01);

	}
	@Test
	public void test() {
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0);
	}

}
