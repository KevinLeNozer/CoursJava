package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        //Path path = Paths.get("C:/Temp/recensement.csv");
        //Path pathDestination = Paths.get("C:/Temp/recensementNew.csv");
        //Files.copy(path, pathDestination);

        boolean estFichier = Files.isRegularFile(path);
        boolean estLisible = Files.isReadable(path);

        System.out.println(estFichier);
        System.out.println(estLisible);

        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8 );
        List<String> outputLines = new ArrayList<>();
        //System.out.println(lines);

        for (String line : lines) {
            if (lines.indexOf(lines) != 0) {// On ignore la première ligne
                // Je suis à la deuxième ligne
                String[] colonnes = line.split(";");
                String sansEspace = colonnes[9].trim().replaceAll(" ", "");
                long populationTotal = -1;

                try {
                    populationTotal = Long.parseLong(sansEspace);
                } catch (NumberFormatException e) {
                    // rien
                }

                if (populationTotal > 25000) {
                    String codeDepartement = colonnes[2];
                    String nomVille = colonnes[6];
                    outputLines.add(nomVille + ";" + codeDepartement + ";" + populationTotal);
                }
            }
        }
        Files.write(pathDestination, outputLines);
    }
}
