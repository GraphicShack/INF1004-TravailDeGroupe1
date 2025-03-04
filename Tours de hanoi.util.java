import java.util.ArrayList;


public class Main {

    public class Tour {
    int nombreDanneaux;
    int top;
    Anneau pile;

    public class Anneau{
        int taille;
        public Anneau(int x) {
            taille = x;
        }
    }
}   

    public Tour (int x) {
    nombreDanneaux = x;//Définir nombre d'anneaux
    pile = new Anneau(nombreDanneaux);//Créer la pile tour qui est contenant des anneaux
    top = -1;//vide a la creation
            }

            public void vider() {
                top = -1;//vider la pile tour
            }

            public String toString() {
                return (" ");
            }

            public int peek(){
                Anneau O = pile(top);//Définir O comme l'anneau du dessus de la pile
                int diametre = O.taille;//Aller chercher le diametre de O
                return (diametre);//Retourner valeur
            }

            public void push(Anneau AnneauActif) {
                Int x = pile.peek();//verifier la taille de l'anneau au dessus de la pile
                Int y = AnneauActif.taille;//aller chercher la taille de l'anneau actif
                    if (x < y) {//si la taille de l'anneau du dessus est plus petit que celle active :
                        println("Un anneau ne peut pas aller sur un anneau plus petit");
                        break;
                    }
                 ++top;//sinon on incremente à la pile
                pile.add(Anneau);//ajouter l'anneau

            }

            public void pop() {
                --top;//On enleve l'anneau sur le desssu de la pile tour
            }

            public boolean isEmpty() {//verifier si la pile est vide
                if (top = -1){
                    return(true);
                }
                return (false);
            }

            public boolean isFull(){
                if (top = nombreDanneaux - 1){//verifier si la pile est pleine
                    return (true);
                }
                return (false);
            }
    }

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
                    code recursive;
                }
            }

            public void resoudre() {
                reinitialiser();
                deplacerAuto();
            }

            public String toString() {
                String fullstring = /n + A.toString + /n + B.toString + /n + C.toString;
                return fullstring;
            }

    }

    public static void Main (String[] args) {
    ToursHanoi th = new ToursHanoi(3);

    }

}