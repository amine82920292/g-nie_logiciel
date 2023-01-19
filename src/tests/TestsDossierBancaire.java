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
	public void testdossierbancaire() {
		DossierBancaire db = new DossierBancaire();
		assertEquals(0,db.get_solde(),0.01);		
		assertEquals(0,db.get_cc().get_solde(),0.01);
		assertEquals(0,db.get_ce().get_solde(),0.01);
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
	public void testremunerer() {
		DossierBancaire db=new DossierBancaire();
		db.deposer(1000);
        db.remunerer();
		assertEquals(1000+1000*0.6*0.032,db.get_solde(),0.01);
		
	}
	@Test
	public void testretirer1() throws Exception  {
		DossierBancaire db=new DossierBancaire();
		db.deposer(1000);
		db.retirer(400);
		assertEquals(600,db.get_solde(),0.01);
		assertEquals(0,db.get_cc().get_solde(),0.01);
	}
	@Test
	public void testretirer2() throws Exception  {
		DossierBancaire db=new DossierBancaire();
		db.deposer(1000);
		db.retirer(400);
		assertEquals(600,db.get_solde(),0.01);
		assertEquals(0,db.get_cc().get_solde(),0.01);
		try {
			db.retirer(10);
			
		}catch(Exception e)
		{
			fail("solde insuffisant!");
		}
	}


}
