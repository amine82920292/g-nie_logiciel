package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import metier.IMetier;
import myPackage.Client;


@RestController
public class Controller {

	@Autowired
	IMetier metier;
	// requete GET  (ex http://localhost:8080/Clients)
	@GetMapping("/Clients")
	public ResponseEntity<Client[]> getAllClients() 
	{
		Client[] tab=metier.getAllClients();
		return new ResponseEntity<>(tab,HttpStatus.OK);			
	}
	
	// requete GET  (ex http://localhost:8080/Client?id=5)
		@GetMapping("/Client")
		public ResponseEntity<Client> getClientById(@RequestParam(value = "id") int id) 
		{
			Client fc=metier.getClientById(id);
			return new ResponseEntity<>(fc,HttpStatus.OK);
		}
		
		// requete GET  (ex http://localhost:8080/ClientsBySolde?sMin=50&sMax=10000)		
		@GetMapping("/ClientsBySolde")
		public ResponseEntity<Client[]> getFilm(@RequestParam(value = "sMin") double sMin,@RequestParam(value = "sMax") double sMax) 
		{
			Client[] fc=metier.getClientBySoldeIn(sMin, sMax);
			return new ResponseEntity<>(fc,HttpStatus.OK);
		}	
		
		// requete POST  (ex http://localhost:8080/Client)
		// Client en JSON dans le body
		@PostMapping("/Client")
		public ResponseEntity<String> addFilm(@RequestBody Client p) 
		{			
			metier.addClient(p);
			return new ResponseEntity<>("ok",HttpStatus.OK);		
		}
}
