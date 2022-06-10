package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static final String DATE_FORMAT_TP1 = "dd/MM/yyyy";
    public static final String DATE_FORMAT_TP2 = "yyyy/MM/dd HH:mm:ss";

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formateur = new SimpleDateFormat(DATE_FORMAT_TP1);

        Date date1 = new Date();
        String chaine1 = formateur.format(date1);
        Date date2 = formateur.parse(chaine1);

        System.out.println(chaine1);

        SimpleDateFormat formateur2 = new SimpleDateFormat(DATE_FORMAT_TP2);
        Date date3 = new Date("19-05/2016 23:59:30");
        String chaine3 = formateur2.format(date3);

        System.out.println(chaine3);
    }
}
