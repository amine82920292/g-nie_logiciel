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
//methode d�poser
	public void deposer(double value) {

		_cc.Deposer(value * 0.4);
		_ce.Deposer(value * 0.6);
		_soldeDB += value;
	}
	//methode getsolde

	public double get_solde() {
		return _soldeDB;
	}
	//methode remunurer 
	public void remunerer() {
		double gain = _ce.remunerer();
		this.deposer(gain);
	
	}
	//methode pour recuperer les informations du compte courant
	public CompteCourant get_cc() {
		return _cc;
	}
	//methode pour recuperer les informations du compte �pargne
	public CompteEpargne get_ce() {
		return _ce;
	}
}
