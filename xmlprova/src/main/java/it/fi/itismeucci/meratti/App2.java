package it.fi.itismeucci.meratti;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {

    public static void main(String[] args) {
        //deserializzazione
        try{
            //xml
            File file = new File("classe.xml");
            XmlMapper xmlMapper = new XmlMapper();
            Classe vxml = xmlMapper.readValue(file, Classe.class);

            System.out.println("XML");
            System.out.println(vxml.getNumero());
            System.out.println(vxml.getAula());
            System.out.println(vxml.getClasse());
            System.out.println(vxml.getListaAlunni());
            //json
            ObjectMapper objectMapper = new ObjectMapper();
            Classe vjson = objectMapper.readValue(new File("Classe.json"), Classe.class);
            System.out.println("JSON");
            System.out.println(vjson.getNumero());
            System.out.println(vjson.getAula());
            System.out.println(vjson.getClasse());
            System.out.println(vjson.getListaAlunni());
        }
        catch(Exception e){
            System.out.println("Eccezione generata");
            System.out.println(e);
            
        }
    }
}
