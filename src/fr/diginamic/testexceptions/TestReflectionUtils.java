package fr.diginamic.testexceptions;

import equals.Villes;

import javax.management.ReflectionException;


public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {
        Villes paris = new Villes("Paris", 10000);

        try {
            ReflectionUtils.afficherAttributs(null);
        }catch (Exception e) {
            throw new ReflectionException(e, "problème ton code est pourrie");
        }

    }
}
