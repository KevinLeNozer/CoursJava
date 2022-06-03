package exercice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ExoAge {
    public static void main(String[] args) {
        //Variable qui contient la date actuelle
        LocalDate today = LocalDate.now();

        System.out.println(today);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuiller entrez votre mois de naissance : ");
        String month = sc.nextLine();
        System.out.println("Veuiller entrez votre année de naissance : ");
        String year = sc.nextLine();
        System.out.println("Veuiller entrez votre jour de naissance : ");
        String day = sc.nextLine();

        String birthday = year + "-" + month + "-" + day;
        LocalDate date = LocalDate.parse(birthday);

        Month userMonth = date.getMonth();
        int userDay = date.getDayOfYear();

        Month now = today.getMonth();
        int nowDay = today.getDayOfYear();

        int age = today.getYear() - date.getYear();

        if (userDay > nowDay) {
            age -= 1;
        }
        System.out.println(comparAge(age));
    }
    public static String comparAge(int age) {
        if (age < 17) {
            return "Vous êtes mineur !";
        } else if (age > 17) {
            return "Vous êtes un adulte !";
        } else {
            return "Vous êtes vieux !";
        }
    }
}
