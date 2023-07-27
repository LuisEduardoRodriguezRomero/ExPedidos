import java.util.List;

public class Conta {

    public String nome;
    private double saldo;

    private double saldoInvestimento;


    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }



    public void setNome(String nome){
        nome = nome;
    }
    public void setSaldo(int saldo){
        saldo = saldo;
    }


    public String getNome(){

        return  nome;
    }
    public double getSaldo(){

        return  saldo;
    }


    public void depositar(double quantidade){

        saldo +=  quantidade;

        System.out.println("Deposito realizado, su saldo atual é: " + saldo);
    }

    public void resgatar(double quantidade){

        saldo -= quantidade;

        System.out.println("Resgate realizado, su saldo atual é: " + saldo);
    }

    public void visualizarDados(){
        System.out.println( "Titular: " + this.getNome() + "  Saldo atual: " + this.getSaldo());
    }

    public void investir(double saldoAInverter){

        if(saldoAInverter <= saldo) {
             saldoInvestimento += saldoAInverter;
             saldo-= saldoAInverter;
            System.out.println("Investimento realizado pelo valor de: " + saldoAInverter + " O saldo de investimento atual é de: " + saldoInvestimento);
        }
        else{

            System.out.println("Saldo insuficiente para este insvestimento");
        }

    }


    public void bonus(){

        if(saldoInvestimento > 0) {
            double lucro = saldoInvestimento * 0.05;
            saldo += lucro;

            System.out.println("Ciclo finalizado, saldo atual: " + saldo);

        }


        else{
            System.out.println("Você não tem saldo para investimentos");
        }

    }



    
}