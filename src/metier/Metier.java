package metier;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import dao.IDao;
import myPackage.Client;


public class Metier implements IMetier{

	@Autowired
	IDao dao;
	
	public Metier()
	{
		
	}

	@Override
	public Client[] getAllClients() {
		// TODO Auto-generated method stub
		Client[] _c=new Client[0] ;
		ArrayList<Client> alc = new ArrayList<Client>();
		try {
			 _c=dao.getAllClients();
			 
			 for(Client c: _c)
				 alc.add(c);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alc.toArray(new Client[0]);
	}

	@Override
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		try {
			System.out.println(c);
			dao.addClient(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void suppById(int id) {
		// TODO Auto-generated method stub
		try {
			System.out.println(id);
			dao.suppById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void suppByNom(String nom) {
		// TODO Auto-generated method stub
		try {
			System.out.println(nom);
			dao.suppByNom(nom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void suppByPrenom(String prenom) {
		// TODO Auto-generated method stub
		try {
			System.out.println(prenom);
			dao.suppByPrenom(prenom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Client[] getClientBySoldeIn(double sMin, double sMax) {
		// TODO Auto-generated method stub
		ArrayList<Client> _fc;
		_fc=new ArrayList<Client>();
		try {
			Client[] _f=this.getAllClients();
		
			for(Client f: _f)
			{
				if(f.getsolde()<=sMax && f.getsolde()>=sMin )
					_fc.add(f);	
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _fc.toArray(new Client[0]);
		
	}

	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		Client c=new Client("Aucun Client", "Ne Correspond",0);
		for(Client c1:this.getAllClients())
		{
			if(id==c1.getId())
				c=c1;
		}
		return c;
	}
	
}
