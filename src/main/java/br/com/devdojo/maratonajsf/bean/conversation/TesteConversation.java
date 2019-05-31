package br.com.devdojo.maratonajsf.bean.conversation;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ConversationScoped
//Transient
public class TesteConversation implements Serializable {

    private List<String> personagens = new ArrayList<String>();
    private List<String>personagemSelecionado = new ArrayList<String>();

    @Inject
    Conversation conversation;


    public void init() {
        if(conversation.isTransient()) {
            conversation.begin();
            System.out.println("Iniciando conversation");
        }
        System.out.println("Entrou no post construct do conversation Scopped");
        personagens.add("Iron Man");
        personagens.add("Thor");
        personagens.add("Capitão");
        personagens.add("Thanos");
    }

    public String endConversation() {
        if(!conversation.isTransient()){
            conversation.end();
        }
        return "conversation?faces-redirect=true";
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
