package equals;

public class AppString {
    public static void main(String[] args) {
        Villes paris = new Villes("Paris", 25884);
        Villes pariss = new Villes("Paris", 25884);

        boolean result = paris.equals(pariss);
        //boolean result1 = paris == pariss;

        System.out.println(result);

    }
}
