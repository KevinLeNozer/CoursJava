package exercice;

public class Exo4 {
    public static void main(String[] args) {
        int tab1[] = {1, 2, 3, 4, 5}, tab2[] = {6, 7, 8, 9, 10};

        //Determine la longueur des tbaleaux
        int a1 = tab1.length;
        int b1 = tab2.length;

        //Variable qui recupere le resultat de la longueur du tableau
        int c1 = a1+ b1;

        //Création d'un nouveau tableau
        int[] c = new int[c1];

        //Boucle pour stocker les elements du premier tableau dans le tableau resultant
        for (int i = 0; i < a1; i++) {
            c[i] = tab1[i];
        }

        //Boucle afin de concatener les elements du second tableau dans le tableau resultant
        for (int i = 0; i < b1; i++) {
            //Stock les elements dans le tableau resultant
            c[a1 + i] = tab2[i];
        }

        //Boucle afin d'afficher les elements du tableau resultant aprés la fusion
        for (int i = 0; i < c1; i++) {
            //Afficher les elements du nouveau tableau
            System.out.println(c[i]);
        }
    }
}
