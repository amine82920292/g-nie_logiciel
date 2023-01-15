package myPackage;

public class DossierBancaire {
//attributs
	private CompteCourant _cc;
	private CompteEpargne _ce;
	private double _soldeDB;

	// Constructeur
	public DossierBancaire() {

		_cc = new CompteCourant();
		_ce = new CompteEpargne();
		_soldeDB = 0;
	}

//methode déposer
	
	public void deposer(double value) {

		_cc.Deposer(value * 0.4);
		_ce.Deposer(value * 0.6);
		_soldeDB += value;
	}
	// methode getsolde

	public double get_solde() {
		return _soldeDB;
	}

	// methode remunurer
	public void remunerer() {
		double gain = _ce.remunerer();
		this.deposer(gain);

	}

	// methode pour recuperer les informations du compte courant
	public CompteCourant get_cc() {
		return _cc;
	}

	// methode pour recuperer les informations du compte épargne
	public CompteEpargne get_ce() {
		return _ce;
	}
	
	//ajout de la méthode retirer
	public void retirer(double somme) throws Exception{
		try
		{
		_cc._solde-=somme;
		_soldeDB=_cc._solde+_ce._solde;
		}
		catch(Exception e1){			
			throw e1;
		}
	}
}
