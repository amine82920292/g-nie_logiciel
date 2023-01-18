package dao;

import myPackage.Client;

public interface IDao {

	
	Client[] getAllClients() throws Exception;
	void addClient(Client c) throws Exception;
	void suppById(int id) throws Exception;
	void suppByNom(String nom) throws Exception;
	void suppByPrenom(String prenom) throws Exception;
	Client getById(int id) throws Exception;
	Client getByNom(String nom) throws Exception;
	Client getByPrenom(String prenom) throws Exception;
	
}
