package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.IDao;

public class Service implements IService {

	
	@Inject //lien avec la couche dao
	private IDao dao;
	
	
	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return dao.appelDao();
	}
	
	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("Après création Service");
		
		
	}
	
	@PreDestroy
	public void logAvantConstruction(){
		
		System.out.println("Avant destruction Service");
		
	}
	
	

}
