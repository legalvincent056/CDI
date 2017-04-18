package interceptor;

import java.util.Scanner;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logged
public class Loggin {
	
	@AroundInvoke
	public Object connect(InvocationContext context) throws Exception {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuilez saisir votre login:");
		String login = clavier.next();
		System.out.println("Veuilez saisir votre mot de passe:");
		String mdp = clavier.next();
	
		if(login.equalsIgnoreCase("root") && mdp.equalsIgnoreCase("root")){
			System.out.println("Connecté");
			return context.proceed();
		}
		else
		{
			System.out.println("Erreur de connexion");
			return null;
		}
	}
		
}
	
