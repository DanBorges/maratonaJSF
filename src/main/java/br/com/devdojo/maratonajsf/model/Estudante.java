package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enuns.Turno;

import java.util.*;


public class Estudante {

    private String nome = "Daniel";
    private String sobrenome = "Lemes Borges";

    private double nota1 =10;
    private double nota2 = 10;
    private double nota3;

    private Turno turno = Turno.MATUTINO;

    private String [] nomesArray =  {"DevDojo", "eh", "foda"};
    private List<String> nomesList = Arrays.asList("Silvenei", "Marionei", "Danielei");
    private Map<String, String> nomesMap = new HashMap();

    {

        nomesMap.put("Goku","Kakaroto");
        nomesMap.put("Naruto", "Medroso");
        nomesMap.put("Kuririn", "Careca");

        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

    public String executar(String nome) {
        return "Danilei da xurupita é: " + nome;
    }

    public void executar2() {
        System.out.println("Danilei da xurupita o fogo apaga e nós não pita");
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

}
