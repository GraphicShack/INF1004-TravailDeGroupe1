
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

    public void deplacer(int de,int vers,Anneau i) {
    //code de validation;
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

}
