package myPackage;

public class CompteCourant extends Compte{

	public CompteCourant() {super();}
	public void Retirer( double somme)throws Exception{
	{
		if(somme > get_solde() ) 
		{
			 throw new Exception("Vous n'avez pas assez sur votre compte courant, essayez d'alimenter le compte, merci");
			}
		
	     
		else  super.set_solde(get_solde()-somme);
	}
	}
}
