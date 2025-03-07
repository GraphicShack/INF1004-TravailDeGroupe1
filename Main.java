import java.util.Scanner;


public class Main {
	
	public static ToursHanoi jouerPartie(ToursHanoi tourH1) {
		ToursHanoi tourH = tourH1;
		boolean partieActif = true;
		Scanner scan = new Scanner(System.in);
		boolean vict = false;
		char de;
		char vers;
		int deEnChiffre=0;
		int versEnChiffre=0;
		boolean valeurValide;
		
		while (partieActif) {
			
			//code d'affichage et entrer utilisateur
			valeurValide = false;
			while (!valeurValide) {
				System.out.println("Enter la lettre de la tour qui contient l'anneau a deplacer");
				de = scan.next().charAt(0);
				switch(de) {
				case 'A':
					deEnChiffre=1;
					valeurValide=true;
					break;
				case 'a':
					deEnChiffre=1;
					valeurValide=true;
					break;
				case 'B':
					deEnChiffre=2;
					valeurValide=true;
					break;
				case 'b':
					deEnChiffre=2;
					valeurValide=true;
					break;
				case 'C':
					deEnChiffre=3;
					valeurValide=true;
					break;
				case 'c':
					deEnChiffre=3;
					valeurValide=true;
					break;
				default:
					System.out.println("Cette valeur n'est pas valide");
					break;
				}
			}
			valeurValide = false;
			while (!valeurValide) {
				System.out.println("Enter la lettre de la tour vers lequel on va deplacer l'anneau");
				vers = scan.next().charAt(0);
				switch(vers) {
					case 'A':
						versEnChiffre=1;
						valeurValide=true;
						break;
					case 'a':
						versEnChiffre=1;
						valeurValide=true;
						break;
					case 'B':
						versEnChiffre=2;
						valeurValide=true;
						break;
					case 'b':
						versEnChiffre=2;
						valeurValide=true;
						break;
					case 'C':
						versEnChiffre=3;
						valeurValide=true;
						break;
					case 'c':
						versEnChiffre=3;
						valeurValide=true;
						break;
					default:
						System.out.println("Cette valeur n'est pas valide");
						break;
				}
			}
				
			//code de deplacements
			tourH.deplacer(deEnChiffre,versEnChiffre);
			
			//code de verification de victoire
			vict = tourH.isFull(3);
			if (vict) {
				partieActif = false;
			}
			
		}
		scan.close();
		return tourH;
	}

    public static void main (String[] args) {
    	ToursHanoi th = new ToursHanoi(3);//initialization initial des tours
    	boolean var = true;
    	Scanner scanner = new Scanner(System.in);
    	
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
    		
    		//code entrer utilisateur
    		inpVar = scanner.nextInt();
    		
    		//Code execution des choix menu
    		switch(inpVar) {
    		case 1:   			
    			//code pour changer nombre d'anneaux
    			System.out.println();
    			System.out.println("Combien d'anneaux veut tu pour ce jeux?");
    			int inpNombre = scanner.nextInt();
    			th = new ToursHanoi(inpNombre);
    			
    			break;
    		case 2:
    			th.reinitialiser();
    			break;
    		case 3:
    			jouerPartie(th);
    			break;
    		case 4:
    			th.resoudre();
    			break;
    		case 5:
    			var=false;
    			break;
    		default:
    			System.out.println();
    			System.out.println("Choix non-disponible.");
    			break;
    		
    		}
    	}
    scanner.close();
    }

}
