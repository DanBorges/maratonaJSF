package br.com.devdojo.maratonajsf.bean.dependent;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@Dependent
public class TesteDependent implements Serializable {
    private List<String> personagens = new ArrayList<String>();
    private List<String>personagemSelecionado = new ArrayList<String>();

    @PostConstruct
    public void init() {
        personagens.add("Pica Pau");
        personagens.add("Leôncio");
        personagens.add("Zeca Urubu");
        personagens.add("Zé jacaré");
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
