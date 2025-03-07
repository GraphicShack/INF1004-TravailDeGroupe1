
public class ToursHanoi {
    int nombreDanneaux;
    Tour A;
    Tour B;
    Tour C;
    Anneau[] ph;//collection temporaire

    public ToursHanoi(int x) {
    	nombreDanneaux = x;
        A = new Tour(nombreDanneaux);//définir la tour A de taille nombre d'anneau
        B = new Tour(nombreDanneaux);//définir la tour B de taille nombre d'anneau
        C = new Tour(nombreDanneaux);//définir la tour C de taille nombre d'anneau
        ph = new Anneau[nombreDanneaux];//définir la pile temporaire "ph"

        for(int n = nombreDanneaux; n > 0; n--){
        	ph[nombreDanneaux - n] = new Anneau(n);//ajouter les anneaux sur la pile temporaire
        }
        this.reinitialiser();
    }

    public void reinitialiser() {
    	A.vider();//vider la tour A
        B.vider();//vider la tour B
        C.vider();//vider la tour C
        Anneau ring;
        for (int i = 0;i < nombreDanneaux;i++) {
        	ring = ph[i];
            A.push(ring);
        }
    }

    public void deplacer(int de,int vers) {

    	Anneau i;
    	//code de validation;
    	int deHaut;//valeur de l'anneau du haut sur la tour initiale
    	int versHaut;//valeur de l'anneau du haut sur la tour cible
    	
    	switch (de) {//switchs necessaire pour cibler l'instance voulu de Tour
    		case 1:
    			deHaut = A.peek();
    			if (deHaut==-1) {//valide si la tour est vide et retourne un message d'erreur au joueur si elle est vide
    	    		System.out.println("Il n'y a pas d'anneau sur la tour A");
    	    		return;//met fin a la method pour que le joueur peut continuer a jouer
    	    	}
    			i=A.pile[A.top];//va chercher l'anneau a deplacer
    			break;
    		case 2:
    			deHaut = B.peek();
    			if (deHaut==-1) {
    	    		System.out.println("Il n'y a pas d'anneau sur la tour B");
    	    		return;
    	    	}
    			i=B.pile[B.top];//va chercher l'anneau a deplacer
    			break;
    		case 3:
    			deHaut = C.peek();
    			if (deHaut==-1) {
    	    		System.out.println("Il n'y a pas d'anneau sur la tour C");
    	    		return;
    	    	}
    			i=C.pile[C.top];//va chercher l'anneau a deplacer
    			break;
    		default:
    			System.out.println("Valeur Invalid");
    			return;
    	}
    	
    	switch (vers) {
			case 1:
				versHaut = A.peek();
				break;
			case 2:
				versHaut = B.peek();
				break;
			case 3:
				versHaut = C.peek();
				break;
			default:
				System.out.println("Valeur Invalid");
				return;
    	}
    	if (deHaut < versHaut || versHaut == -1) { //valide que l'anneau qu'on deplace est plus petit que l'anneau du haut de la destination ou que la destination est vide
    		
    		switch (de) {//Switch case pour la valeur "de"
        		case 1:
        			A.pop();
        			break;
        		case 2:
        			B.pop();
                	break;
        		case 3:
        			C.pop();
        			break;
        		default:
        			return;
    		}

        	switch (vers) {//switch case pour la valeur "vers"
        		case 1:
        			A.push(i);
                	break;
        		case 2:
        			B.push(i);
                	break;
        		case 3:
        			C.push(i);
                	break;
        		default:
        			return;
        	}
    	} else {
    		System.out.println("Ce deplacement n'est pas valide");
    	}
    }

    public void deplacerAuto(int disque) {
    	if (disque==1) {
    		//code de deplacement;
    	}
    	else {
    		//code recursive;
    	}
    }

    public void resoudre() {
    	reinitialiser();
        deplacerAuto(nombreDanneaux);
    }

    public String toString() {
    	return "Tour A: " + A.toString() + "\n" + 
               "Tour B: " + B.toString() + "\n" + 
               "Tour C: " + C.toString();
    }
    
    public boolean isFull(int inpTour) { //method pour retourner aller chercher si une tour est pleine
    	boolean plein;
    	switch(inpTour){
    		case 1:
    			plein = A.isFull();
    			break;
    		case 2:
    			plein = B.isFull();
    			break;
    		case 3:
    			plein = C.isFull();
    			break;
    		default:
    			plein = false;
    			break;
    	}
    	return plein;
    }


}
