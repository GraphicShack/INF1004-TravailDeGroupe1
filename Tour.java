
public class Tour {

	int nombreDanneaux;
	int top;
	Anneau[] pile;
	   
    public Tour (int x) {
    	nombreDanneaux = x;//Définir nombre d'anneaux
	    pile = new Anneau[nombreDanneaux];//Créer la pile tour qui est contenant des anneaux
	    top = -1;//vide a la creation
    }

	public void vider() {
		top = -1;//vider la pile tour
	}

	public String toString() {
		String result = "Tour: ";
	    for (int i = 0; i < nombreDanneaux; i++) {
	    	if (i <= top) {
	    		Anneau anneauxActif = pile[i];
	    		int diam = anneauxActif.taille;
	    		result += diam + " ";  // Ajouter le diamètre de l'anneau suivi d'un espace
	        } else {
	        	result += "- ";  // Un tiret pour les emplacements vides suivi d'un espace
	        }
	    }
	    return result.trim();  // Enlever l'espace en trop à la fin
	}

	public int peek() {
	    if (top == -1) {
	        return -1; // Retourne -1 si la tour est vide
	    }
	    return pile[top].taille;// Retourne la taille de l'anneau du haut
	}

	public void push(Anneau AnneauActif) {
		int x = peek();//verifier la taille de l'anneau au dessus de la pile
	    int y = AnneauActif.taille;//aller chercher la taille de l'anneau actif
	    if (x < y && x != -1) {//si la taille de l'anneau du dessus est plus petit que celle active :
	    	System.out.println("Un anneau ne peut pas aller sur un anneau plus petit");
	        return;
	    }
	    ++top;//sinon on incremente à la pile
	    pile[top]=AnneauActif;//ajouter l'anneau

	}

	public void pop() {
		--top;//On enleve l'anneau sur le desssu de la pile tour
	}

	public boolean isEmpty() {//verifier si la pile est vide
		if (top == -1){
			return(true);
		}
	    return (false);
	}

	public boolean isFull(){
		if (top == nombreDanneaux - 1){//verifier si la pile est pleine
			return (true);
		}
	    return (false);
	}
}
