package br.com.devdojo.maratonajsf.bean.comunicacao;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class Comunicacao implements Serializable {

    private String nome;
    private String sobrenome;


    public void imprimir() {
        String paramentro =FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(paramentro);
    }

    public String save() {
        System.out.println(nome);
        System.out.println(sobrenome);
        return "comunicacao2.xhtml?faces-redirect=true&nome="+nome+"&sobrenome="+sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSorenome() {
        return sobrenome;
    }

    public void setSorenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
