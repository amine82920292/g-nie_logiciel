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
		_soldeDB = _cc.get_solde() + _ce.get_solde();
	}

//methode dï¿½poser

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
		this.get_ce().Deposer(gain);
		_soldeDB = _cc.get_solde() + _ce.get_solde();
	}

	// methode pour recuperer les informations du compte courant
	public CompteCourant get_cc() {
		return _cc;
	}

	// methode pour recuperer les informations du compte ï¿½pargne
	public CompteEpargne get_ce() {
		return _ce;
	}

	// ajout de la méthode retirer
	public void retirer(double somme) throws Exception {
		{
			_cc.Retirer(somme);
			_soldeDB -= somme;

		}
	}

	@Override
	public String toString() {
		return " Dossier Bancaire [" + " solde compte courant=" + _cc.get_solde() + " euro(s) solde compte Epargne="
				+ _ce.get_solde() + " euro(s) ]";
	}
}
