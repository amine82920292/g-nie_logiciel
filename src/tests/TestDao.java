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
import myPackage.Client;

public class TestDao {

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
	public void testdao() {
		IDao dao=ctx.getBean(IDao.class);
		try {
		for(Client f:dao.getAllClients())
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
