package CoursObjet;

public class Ornithorinque extends  Mammifere{


    void seNourrir() {
        System.out.println("l'Ornithorinque mange");
    }


    @Override
    protected void gestation() {
        System.out.println("l'Ornithorinque est un ovipare");
    }
}
