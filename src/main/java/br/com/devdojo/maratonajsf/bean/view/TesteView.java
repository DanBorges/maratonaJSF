package br.com.devdojo.maratonajsf.bean.view;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependent;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
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
    private final TesteDependent dependent;

    @Inject
    public TesteView(TesteDependent dependent) {
        this.dependent = dependent;
    }

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
        dependent.getPersonagemSelecionado().add(personagem);

    }


    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public TesteDependent getDependent() {
        return dependent;
    }
}
