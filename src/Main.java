import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Conta conta = new Conta("Luis Eduardo Rodriguez Romero", 100);

        conta.visualizarDados();
        System.out.println("---------------------------------------------------");
        conta.depositar(200);
        conta.visualizarDados();
        System.out.println("---------------------------------------------------");
        conta.resgatar(100);
        conta.visualizarDados();
        System.out.println("---------------------------------------------------");
        conta.investir(100);
        conta.visualizarDados();
        System.out.println("---------------------------------------------------");
        conta.bonus();
        conta.visualizarDados();
        System.out.println("---------------------------------------------------");
        conta.investir(1000);


    }



}