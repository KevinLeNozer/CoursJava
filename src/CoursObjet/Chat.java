package CoursObjet;

public class Chat extends Mammifere implements Chasseur {
    @Override
    void seNourrir() {
        System.out.println("Le chat mange");
    }

    public void miaou() {
        System.out.println("miaou");
    }

    @Override
    public void chasser() {
        System.out.println("Chasseur" + getTypeChasseur());
    }

    @Override
    public String getTypeChasseur() {
        return " diurne";
    }
}
