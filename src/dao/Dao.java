package dao;

import java.util.ArrayList;
import myPackage.Client;

public class Dao implements IDao {

	private ArrayList<Client> _Clients;
	
	public Dao(){
		_Clients=new ArrayList<Client>();
		_Clients.add(new Client("Dupont", "Nicolas", 1));
		_Clients.add(new Client("Lynch", "David", 2));
		_Clients.add(new Client("Spielberg", "Steven ",3));
		_Clients.add(new Client("Villeneuve", "Denis",4));
		_Clients.add(new Client("Forman", "Milos",5));
		_Clients.add(new Client("Martin", "Scorsese",6));
		_Clients.add(new Client("Pierre", "Salvadori",7));
		_Clients.add(new Client("Diouf", "Annastasie",8));
		for(int i=0;i<_Clients.size();i++)
		{
			_Clients.get(i).getdb().deposer(i*550);			
		}
	}
	
	public Client[] getAllClients() {		
		return _Clients.toArray(new Client[0]);
	}
	

	
	public void suppById(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<_Clients.size();i++)
		{
			if(id==_Clients.get(i).getId())
				_Clients.remove(i);			
		}	
	}
	
	public void suppByNom(String nom) {
		// TODO Auto-generated method stub
		for(int i=0;i<_Clients.size();i++)
		{
			if(nom==_Clients.get(i).getNom())
				_Clients.remove(i);			
		}	
	}
	
	public void suppByPrenom(String prenom) {
		// TODO Auto-generated method stub
		for(int i=0;i<_Clients.size();i++)
		{
			if(prenom==_Clients.get(i).getPrenom())
				_Clients.remove(i);			
		}	
	}

	@Override
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		Client c1=new Client(c.getNom(),c.getPrenom(),_Clients.size()+1);
		_Clients.add(c1);
	}

	@Override
	public Client getById(int id) throws Exception {
		// TODO Auto-generated method stub
		Client c=new Client( "Ne Correspond a","Aucun Client",0);
		for(int i=0;i<_Clients.size();i++)
		{
			if(id==_Clients.get(i).getId())
				c=_Clients.get(i);
		}
		return c;
	}

	@Override
	public Client getByNom(String nom) throws Exception {
		// TODO Auto-generated method stub
		Client c=new Client( "Ne Correspond a ","Aucun Client",0);
		for(int i=0;i<_Clients.size();i++)
		{
			if(nom==_Clients.get(i).getNom())
				c=_Clients.get(i);		
		}
		return c;
	}

	@Override
	public Client getByPrenom(String prenom) throws Exception {
		// TODO Auto-generated method stub
		Client c=new Client( "Ne Correspond a ","Aucun Client",0);
		for(int i=0;i<_Clients.size();i++)
		{
			if(prenom==_Clients.get(i).getPrenom())
				c=_Clients.get(i);				
		}
		return c;
	}
}
