package myPackage;

public class CompteCourant extends Compte{

	public CompteCourant() {super();}
	
	public double get_solde() {return _solde;}
	
	public void Deposer(double somme){_solde+=somme;}
}
