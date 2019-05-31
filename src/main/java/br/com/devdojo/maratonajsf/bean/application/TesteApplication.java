package br.com.devdojo.maratonajsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class TesteApplication implements Serializable {
    private List<String> listaCategoriasFilmes = new ArrayList<String>();

    @PostConstruct
    public void init() {
        System.out.println("Entrou no post construct do applicatio scoped");
        listaCategoriasFilmes.add("Comédia");
        listaCategoriasFilmes.add("Ação");
        listaCategoriasFilmes.add("porno");
    }

    public void mudarLista() {
        listaCategoriasFilmes.add("Anime");
    }

    public List<String> getListaCategoriasFilmes() {
        return listaCategoriasFilmes;
    }

    public void setListaCategoriasFilmes(List<String> listaCategoriasFilmes) {
        this.listaCategoriasFilmes = listaCategoriasFilmes;
    }
}
