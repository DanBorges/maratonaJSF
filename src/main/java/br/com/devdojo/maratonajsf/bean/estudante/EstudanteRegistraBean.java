package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;


import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class EstudanteRegistraBean implements Serializable {
    Estudante estudante = new Estudante();
    private boolean exibeNotas;
    private boolean exibeLink;

    public boolean isExibeNotas() {
        return exibeNotas;
    }

    public void setExibeNotas(boolean exibeNotas) {
        this.exibeNotas = exibeNotas;
    }

    public void mostrarNotas() {
        this.exibeNotas=true;
    }
    public void esconderNotas() {
        this.exibeNotas=false;
    }

    public void mostrarLink() {
        this.exibeLink=true;
    }
    public void esconderLink() {
        this.exibeLink=false;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public boolean isExibeLink() {
        return exibeLink;
    }

    public void setExibeLink(boolean exibeLink) {
        this.exibeLink = exibeLink;
    }


}
