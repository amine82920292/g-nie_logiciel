package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.config;
import dao.IDao;
import metier.IMetier;
import myPackage.Client;

public class TestMetier {

	private static AnnotationConfigApplicationContext ctx;
	@BeforeClass
	public static void setUp(){
	ctx=null;
	try{
		ctx=new AnnotationConfigApplicationContext(config.class);
	}
	catch(Exception ex){ fail("Problème Spring");}
	}
	@AfterClass
	public static void tearDown()
	{ 	
		if(ctx!=null) ctx.close();		
	}

	@Test
	public void testmetier() {
		IMetier metier=ctx.getBean(IMetier.class);
		try {
		for(Client f:metier.getAllClients())
		{
			System.out.println(f);			
		}
		}
		catch(Exception ex)
		{
			//ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

}
