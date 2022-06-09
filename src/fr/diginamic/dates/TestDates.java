package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

        Date date1 = new Date();
        String chaine1 = formateur.format(date1);
        Date date2 = formateur.parse(chaine1);

        System.out.println(chaine1);

        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date3 = new Date("19/05/2016 23:59:30");
        String chaine3 = formateur2.format(date3);

        System.out.println(chaine3);
    }
}
