package myPackage;

public class Compte {
	protected double _solde;
	
	public Compte() { _solde=0;}

	public void Deposer(double somme){_solde+=somme;}
	
	public double get_solde() {return _solde;}
	
	public double set_solde(double newsolde) {return _solde=newsolde;}
	
}
