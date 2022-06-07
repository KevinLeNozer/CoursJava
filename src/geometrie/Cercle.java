package geometrie;

public class Cercle implements ObjetGeometrique {
    Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    @Override
    public double surface() {
        return (rayon * rayon) * Math.PI;
    }
}
