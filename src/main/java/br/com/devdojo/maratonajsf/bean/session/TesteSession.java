package br.com.devdojo.maratonajsf.bean.session;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@SessionScoped
public class TesteSession implements Serializable {
    private List<String> personagens = new ArrayList<String>();
    private List<String>personagemSelecionado = new ArrayList<String>();

    @PostConstruct
    public void init() {
        personagens.add("Flash");
        personagens.add("Batman");
        personagens.add("Superman");
        personagens.add("capitão planeta");
    }

    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(4);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);

    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
