package it.fi.itismeucci.meratti;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) {
        Alunno a1 = new Alunno("Niccolo", "Battistini", new Date(1, 12, 2005));
        Alunno a2 = new Alunno("Anna", "Magnini", new Date(25, 9, 2014));
        Alunno a3 = new Alunno("Giuseppe", "Senatore", new Date(18, 1, 2000));
        Alunno a4 = new Alunno("Pino", "Dragons", new Date(12, 7, 2009));

        ArrayList<Alunno> ar1 = new ArrayList<>();
        ar1.add(a1);
        ar1.add(a2);
        ar1.add(a3);
        ar1.add(a4);

        Classe c1 = new Classe(5, "CIA", "4tc-pt", ar1);
        
        //Serializzazione
        try {
            //xml
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("classe.xml"), c1);
            File file = new File("classe.xml");
            //json
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("Classe.json"), c1);
        } catch (Exception e) {
            System.out.println("Eccezione generata");
        }
    }
}
