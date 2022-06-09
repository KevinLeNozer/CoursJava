public class classeBase {
    public static void main(String[] args) {
        String str1 = String.format("J'ai %50.2f€ en poche", 2.5);
        System.out.println(str1);

        long start;
        long stop;

        StringBuilder builder = new StringBuilder();
        String concat = "";

        start = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            concat += "itération" + "i" + "\n";
        }
        stop = System.currentTimeMillis();

        System.out.println("Temps de traitement concat :" + (stop - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append("itération").append(i).append("\n");
        }

        stop = System.currentTimeMillis();
        System.out.println("Temps de traitement builder :" + (stop - start));
    }
}
