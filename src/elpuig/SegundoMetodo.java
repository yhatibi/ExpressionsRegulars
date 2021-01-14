package elpuig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SegundoMetodo {
    public SegundoMetodo() {
        System.out.println();
        System.out.println("-----------------Segundo Metodo-----------------");
        System.out.println();
        int pareNoel = 0;
        int noel = 0;
        int follets = 0;
        int contFollets = 0;

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\Yasin\\Desktop\\santako.txt"));
            String line = reader.readLine();
            while (line != null) {
                contFollets++;
                pareNoel = 0;
                noel = 0;
                follets = 0;


                pareNoel = ( line.split("\\*<]:-DOo", -1).length ) - 1;
                noel = ( line.split(">:o\\)", -1).length ) - 1;
                follets = ( line.split("<]:-D", -1).length ) - 1;


                if (pareNoel>0) {
                    System.out.print("Pare Noel ("+ pareNoel +") ");;
                }
                if (noel>0) {
                    System.out.print("Ren ("+noel+") ");
                }
                if (follets>0 && contFollets > 2) {
                    System.out.print("Follet ("+follets+")");;
                }
                System.out.println();


                line = reader.readLine();
            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
