package myPackage;

public class DossierBancaire {
	
	private CompteCourant _cc;
	 private double _soldeDB;
	    
	
	//Constructeur
    public DossierBancaire()
    {	
    	_cc=new CompteCourant(); 
    	_soldeDB=_cc._solde;
    }

    public void deposer(double value)
    {
    	
    	_cc._solde+=value;
    	_soldeDB+=value;
    	}
    
    public double get_solde() {return _soldeDB;}
    
    public void remunerer() {}
	
  //oN AJOUTE UNE METHODE GETTEUR POUR RETURNER LES INFOS DU COMPTE COURANT 
    public CompteCourant get_cc() {return _cc;}
    
 
}
