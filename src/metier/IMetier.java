package metier;

import myPackage.Client;

public interface IMetier {

	Client[] getAllClients() ;
	void addClient(Client c);
	void suppById(int id);
	void suppByNom(String nom);
	void suppByPrenom(String prenom);
	Client getClientById(int id) ;
	Client[] getClientBySoldeIn(double sMin, double sMax);
}
