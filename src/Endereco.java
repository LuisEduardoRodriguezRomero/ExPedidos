public class Endereco {
    public String rua;

    public int numero;



    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;

    }


    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Rua: " + getRua() + " " + "Numero: " + getNumero() +  "\n";
    }
}
