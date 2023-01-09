package myPackage;

public class DossierBancaire {

	private CompteCourant _cc;
	private CompteEpargne _ce;
	private double _soldeDB;

	// Constructeur
	public DossierBancaire() {

		_cc = new CompteCourant();
		_ce = new CompteEpargne();
		_soldeDB = 0;
	}

	public void deposer(double value) {

		_cc.Deposer(value * 0.4);
		_ce.Deposer(value * 0.6);
		_soldeDB += value;
	}

	public double get_solde() {
		return _soldeDB;
	}

	public void remunerer() {
		double gain = _ce.remunerer();
		this.deposer(gain);
	
	}

	public CompteCourant get_cc() {
		return _cc;
	}

	public CompteEpargne get_ce() {
		return _ce;
	}
}
