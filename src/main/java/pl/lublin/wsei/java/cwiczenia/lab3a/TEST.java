package pl.lublin.wsei.java.cwiczenia.lab3a;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TEST{
    public static void main(String[] args) throws java.io.IOException {
        try {
            String contents = new String(Files.readAllBytes(Paths.get( "gusInfoGraphic.xml")));
            System.out.println("ZAWARTOŚĆ PLIKU gusInfoGraphic.xml");
            System.out.print(contents);
        } catch (IOException e) {
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml =>" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}