package br.com.devdojo.maratonajsf.bean.request;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.AsyncListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@RequestScoped
public class TesteRequest implements Serializable {

    private List<String> personagens = new  ArrayList<String>();
    private List<String>personagemSelecionado = new ArrayList<String>();

    public void selecionarPersonagem() {
        personagens.add("GOKU");
        personagens.add("Freeza");
        personagens.add("Naruto");
        personagens.add("Urutimaru");


        int index = ThreadLocalRandom.current().nextInt(4);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);


    }



    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
