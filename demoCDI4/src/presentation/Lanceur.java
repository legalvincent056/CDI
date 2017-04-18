package presentation;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import service.IService;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {
		//1- Chargement du conteneur
		WeldContainer weld = new Weld().initialize(); //charger Weld.environnement.se
		
		//2- Récupération du service
		
		IService service = weld.instance().select(Service.class).get();
		
		//3- Appel de la méthode à éxecuter
		
		String resultat = service.appelDao();
		System.out.println(resultat);
		
		//4- destruction des objets
		weld.instance().destroy(service);
		
	}

}
