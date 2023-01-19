package myPackage;

public class CompteEpargne extends Compte {

	private double _taux;
	
	public CompteEpargne() {
		super(); 
		_taux=3.2/100;
	}
	public double get_taux() {return _taux;}
	
	
	public double remunerer()
	{
		return super.get_solde()*_taux;
	}
	
	
}
