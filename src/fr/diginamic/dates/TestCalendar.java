package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdfFr = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.FRANCE);
        SimpleDateFormat sdfUk = new SimpleDateFormat("EEEEE MMMMM" ,Locale.UK);
        SimpleDateFormat sdfJp = new SimpleDateFormat("EEEEE MMMMM" ,Locale.JAPAN);
        SimpleDateFormat sdfGm = new SimpleDateFormat("EEEEE MMMMM" ,Locale.GERMANY);

        System.out.println(sdfFr.format(cal.getTime()));
        System.out.println(sdfUk.format(cal.getTime()));
        System.out.println(sdfJp.format(cal.getTime()));
        System.out.println(sdfGm.format(cal.getTime()));

        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        System.out.println(sdfFr.format(cal.getTime()));
    }
}
