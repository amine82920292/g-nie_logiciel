package myPackage;

public class CompteEpargne extends Compte {

	private double _taux;
	
	public CompteEpargne() {
		super(); 
		_taux=3.2/100;
	}
	public double get_taux() {return _taux;}
	public double get_solde() {return _solde;}
	
	public double remunerer()
	{
		return _solde*_taux;
	}
	
	public void Deposer(double somme){_solde+=somme;}
}
