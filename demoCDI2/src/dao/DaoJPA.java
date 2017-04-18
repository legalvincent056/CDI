package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;


@NotificationTypeDao(TypeDao.JPA) //Ajout de la notification dans la classe
public class DaoJPA implements IDao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return null;
	}
	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("Après création Dao JPA");
		
		
	}
	
	@PreDestroy
	public void logAvantConstruction(){
		
		System.out.println("Avant destruction Dao JPA");
		
}
	}
