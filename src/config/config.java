package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dao.Dao;
import dao.IDao;
import metier.IMetier;
import metier.Metier;


@Configuration
public class config {
	
	@Bean
	IDao dao(){ return new Dao();}
	
	@Bean
	IMetier metier(){ return new Metier();}
}
