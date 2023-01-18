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
		_soldeDB = _cc.get_solde()+_ce.get_solde();
	}

//methode d�poser
	
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
		_soldeDB = _cc.get_solde()+_ce.get_solde();
	}

	// methode pour recuperer les informations du compte courant
	public CompteCourant get_cc() {
		return _cc;
	}

	// methode pour recuperer les informations du compte �pargne
	public CompteEpargne get_ce() {
		return _ce;
	}
	
	//ajout de la méthode retirer
		public void retirer(double somme) throws Exception{
			try
			{
			int s=(int) _cc._solde;
			s-=somme;
			if(s>=0) {
			_cc._solde-=somme;
			_soldeDB=_cc._solde+_ce._solde;}
			}
			catch(Exception e1){	
				e1.getMessage();
				System.out.println("Vous n'avez pas assez dans votre compte");
				throw e1;
				
			}
		}
		
		@Override
		public String toString() {
			return " Dossier Bancaire [" + " solde compte courant=" + _cc.get_solde() + " euro(s) solde compte épargne="
		+ _ce.get_solde() +" euro(s) ]";
		}
}
