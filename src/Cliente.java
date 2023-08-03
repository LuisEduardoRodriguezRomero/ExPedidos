import java.util.List;

public class Cliente {

    public String nome;
    public List<Endereco> enderecos;



    public Cliente(String nome, List<Endereco> enderecos){
        this.nome = nome;

        this.enderecos =enderecos;

    }



    public void setNome(String nome){
        nome = nome;
    }

    public String getNome(){

        return  nome;
    }

    public List<Endereco> getEnderecos(){

        return enderecos;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + " " + "Enderecos: " + getEnderecos() +  "\n";
    }



}