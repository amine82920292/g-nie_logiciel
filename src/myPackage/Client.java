package myPackage;

public class Client {
  
	private  String _nom;
	private  String _prenom;
	private  int _Id;
	private DossierBancaire _db;
	
	public Client(String nom, String prenom,  int Id)
	{
		_nom=nom;
		_prenom=prenom;
		_Id=Id;
		_db= new DossierBancaire();
	}
	
	public int getId() {
		return _Id;
	}

	public String getNom() {
		return _nom;
	}
	
	public String getPrenom() {
		return _prenom;
	} 
	
	public void setId(int id) {
		this._Id = id;
	}
	
	public void setNom(String nom) {
		this._nom=nom;
	}
	
	public void setPrenom(String prenom) {
		this._prenom=prenom;
	}
	public double getsolde() {
		return this._db.get_solde();
	}
	
	public DossierBancaire getdb() {
		return _db;
	}
	@Override
	public String toString() {
		return "User [" + " nom=" + _nom + " prenom=" + _prenom +" id=" + _Id + _db.toString() + "]";
	}
}
