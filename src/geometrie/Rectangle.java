package geometrie;

public class Rectangle implements ObjetGeometrique{
    Double longueur;
    Double largeur;

    @Override
    public double perimetre() {
        return 2 * longueur + largeur;
    }

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return (longueur * largeur) * Math.PI;
    }
}
