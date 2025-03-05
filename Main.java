import java.util.ArrayList;


public class Main {

    public static void Main (String[] args) {
    	ToursHanoi th = new ToursHanoi(3);//initialization initial des tours
    	boolean var = true;

    	
    	while (var) {
        	int inpVar;
    		//code pour afficher le menu
    		th.toString();
    	
    		System.out.println();
    		System.out.println("[MENU]");
    		System.out.println();
    		System.out.println("1: Déterminer le nombre d'anneaux (3 par défault)");
    		System.out.println("2: Réinitialiser les tours");
    		System.out.println("3: Jouer un coup");
    		System.out.println("4: Montrer la solution");
    		System.out.println("5: Quitter");
    		System.out.println("Faites votre choix et appuyer sur ENTER");
    		
    		//code entrer utilisateur et validation de choix
    		
    		//Code execution des choix menu
    		switch(inpVar) {
    		case 1:
    			//code pour changer nombre d'anneaux
    			break;
    		case 2:
    			th.reinitialiser();
    			break;
    		case 3:
    			//code pour jouer une partie
    			break;
    		case 4:
    			th.resoudre();
    			break;
    		case 5:
    			var=false;
    			break;
    		default:
    			break;
    		
    		}
    	}
    }

}
