package it.fi.itismeucci.meratti;

import java.util.ArrayList;
import java.util.Objects;

public class Classe {
    private int numero;
    private String classe;
    private String aula;
    private ArrayList<Alunno> listaAlunni;

    public Classe() {
    }

    public Classe(int numero, String classe, String aula, ArrayList<Alunno> listaAlunni) {
        this.numero = numero;
        this.classe = classe;
        this.aula = aula;
        this.listaAlunni = listaAlunni;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getListaAlunni() {
        return this.listaAlunni;
    }

    public void setListaAlunni(ArrayList<Alunno> listaAlunni) {
        this.listaAlunni = listaAlunni;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe classe(String classe) {
        setClasse(classe);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe listaAlunni(ArrayList<Alunno> listaAlunni) {
        setListaAlunni(listaAlunni);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Classe)) {
            return false;
        }
        Classe classe = (Classe) o;
        return numero == classe.numero && Objects.equals(classe, classe.classe) && Objects.equals(aula, classe.aula) && Objects.equals(listaAlunni, classe.listaAlunni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, classe, aula, listaAlunni);
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", classe='" + getClasse() + "'" +
            ", aula='" + getAula() + "'" +
            ", listaAlunni='" + getListaAlunni() + "'" +
            "}";
    }
}
