package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique tab[] = new ObjetGeometrique[2];

        tab[0] = new Cercle(5.2);
        tab[1] = new Rectangle(4.2, 9.8);

        for (ObjetGeometrique afficheTab : tab) {
            System.out.println("Le perimètre du rectangle et du cercle : " + Math.round(afficheTab.perimetre()));
            System.out.println("La surface du rectangle et du cercle : " + Math.round(afficheTab.surface()));
        }
    }
}
