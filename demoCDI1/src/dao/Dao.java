package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements IDao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour, je suis bien dans la Dao";
	}

	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("Après création Dao");
		
		
	}
	
	@PreDestroy
	public void logAvantConstruction(){
		
		System.out.println("Avant destruction Dao");
		
	}
	
	
}
