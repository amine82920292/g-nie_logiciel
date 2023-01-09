package tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import myPackage.CompteCourant;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestsDossierBancaire.class,
	CompteCourant.class

})

public class TestsSuite {

}
