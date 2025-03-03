import java.util.ArrayList;


public class Main {

    public class Tour {
    int nombreDanneaux;
    int top;
    Anneau pile;

    public Tour (int x) {
    nombreDanneaux = x;
    pile = new Anneau(nombreDanneaux);
    top = -1;
            }

        public void vider() {
            top = -1;
            }

            public String toString() {
                return (" ");
            }

            public void push(int y1) {
                Anneau x = pile.peek();
                Anneau y = y1;
                    if (x.taille < y.taille) {
                        println("Un anneau ne peut pas aller sur un anneau plus petit");
                        break;
                    }
                 ++top;
                pile.add(y);

            }

            public void pop() {
                --top;
            }

            private boolean validateAjout(int y) {
                boolean x;
                x=true;
                return x;
            }

            private boolean validateEnlever(int y) {
                boolean x;
                x=true;
                return x;
            }
    }

    public class Anneau{
        int taille;
        public Anneau(int x) {
            taille = x;
        }
    }


    public class ToursHanoi {

        int nombreDanneaux;
        Tour A;
        Tour B;
        Tour C;
        Anneau[] ph;

        public ToursHanoi(int x) {
            nombreDanneaux = x;
            A = new Tour(nombreDanneaux);
            B = new Tour(nombreDanneaux);
            C = new Tour(nombreDanneaux);
            ph = new Anneau[nombreDanneaux];

                for(int n = 0; n < nombreDanneaux; n++){
                    ph[n] = new Anneau(n+1);
                  }
            }

        public void reinitialiser() {
            A.vider();
            B.vider();
            C.vider();
            Anneau ring;
            for (int i = 0;i < nombreDanneaux;i++) {
                ring = ph[i];
                A.push(ring);
                  }
            }

        public void deplacer(char de,char vers,Anneau i) {
            code de validation;
            de.pop();
            ver.push(i);
            }

            public void deplacerAuto(int disque) {
                if (disque==1) {
                    code de deplacement;
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
