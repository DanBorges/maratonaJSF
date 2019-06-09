package br.com.devdojo.maratonajsf.bean.comunicacao;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class Comunicacao2 implements Serializable {

    private String nome;
    private String sobrenome;

    @PostConstruct
    public void init() {
       Map<String,String> paramsMap =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
       nome = paramsMap.get("nome");
       sobrenome = paramsMap.get("sobrenome");

        System.out.println(nome);
        System.out.println(sobrenome);
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
}
