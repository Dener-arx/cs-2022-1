package Tarefa010.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private List<Contato> contatos = new ArrayList<>();


    public void addContato( String nome, String email ){
        contatos.add(new Contato(nome, email));
    }

    public Contato searchContato(String entry){
        for(Contato i : contatos){
            if( entry.equals(i.getNome()) || entry.equals(i.getEmail()) ){
                return i;
            }
        }
        return null;
    }

    public void removeContato(String nome){
        for( int i=0 ; i<contatos.size() ; i++ ){
            if(nome.equals(contatos.get(i).getNome())){
                contatos.remove(contatos.get(i));
            }
        }
    }

    public void listContatos(){
        for(Contato i : contatos){
            System.out.println(i.getNome() + " - " + i.getEmail());
        }
    }

}
