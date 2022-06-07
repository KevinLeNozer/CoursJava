package geometrie;

public class Cercle implements ObjetGeometrique {
    Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * rayon * Math.PI;
    }
    @Override
    public double surface() {
        return Math.pow(rayon, 2) * Math.PI;
    }
}
