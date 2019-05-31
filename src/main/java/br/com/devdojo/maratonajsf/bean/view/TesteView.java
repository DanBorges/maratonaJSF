package br.com.devdojo.maratonajsf.bean.view;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ViewScoped
public class TesteView implements Serializable {
    private List<String> personagens = new ArrayList<String>();
    private List<String>personagemSelecionado = new ArrayList<String>();

    @PostConstruct
    public void init() {
        personagens.add("Xikamaru");
        personagens.add("Sakura");
        personagens.add("Inno");
        personagens.add("Tsunabi");
    }

    public void selecionarPersonagem() {
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
