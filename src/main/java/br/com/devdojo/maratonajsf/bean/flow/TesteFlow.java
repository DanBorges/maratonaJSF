package br.com.devdojo.maratonajsf.bean.flow;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@FlowScoped(value="registration")
public class TesteFlow implements Serializable {

    private String nome;
    private String sobrenome;
    private String endereco;


    public void salvar() {
        System.out.println("Salvando no banco");
        System.out.println(nome);
        System.out.println(endereco);
        validarUsuario();

    }

    public String validarUsuario() {
        List<String> listaErros = new ArrayList<String>();
        if(this.nome.length()<5) {
            listaErros.add("Nome de usário tem ter no mínimo 5 caracteres");
        }
        if(this.sobrenome.length()<5) {
            listaErros.add("Sobrenome de usário tem ter no mínimo 5 caracteres");
        }
        if(listaErros.size() > 0) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    listaErros.toString(), "mensagem"));

        }
        return "exitToInicio";
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
