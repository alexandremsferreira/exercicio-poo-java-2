
package agenda;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int quantAmigos;
    private int quantConhecidos;

        
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
   
    public int getQuantAmigos() {
        return quantAmigos;
    }

    public void setQuantAmigos(int quantAmigos) {
        this.quantAmigos = quantAmigos;
    }

    public int getQuantConhecidos() {
        return quantConhecidos;
    }

    public void setQuantConhecidos(int quantConhecidos) {
        this.quantConhecidos = quantConhecidos;
    }
   
    public void exibir() {
       for (Pessoa p: pessoas) {
           System.out.println("Nome: " + p.getNome() + "   Email: " + p.getEmail() + "   Data de aniversário: " + p.getDataAniversario());
       }
    }
    
    
}
