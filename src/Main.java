import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
   public static int option = 1;
   public static List<Cliente> clientes = new ArrayList<>();



    public Main(){
    }


    public static void main(String[] args) throws IOException {




        int sair = 1;
        int controle = 1;

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("pizza",20));
        produtos.add(new Produto("hamburguer",10));
        produtos.add(new Produto("refrigerante",5));

        do {


        switch (menu()) {

            case 0:
                System.exit(0);
            case 1:

                cadastrarCliente();
                break;

            case 2:
              Cliente  client = listarClientes();
              Endereco endere = listarEnderecos(client);
                realizarPedido(client,produtos,endere);
                break;


            default:
                System.out.print("Opcao invalida \n");



        }



    }while(controle==1);



        }

        public static int menu(){

        System.out.println("Escolha uma opção");
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Realizar Pedido");
        System.out.println("0- Sair");
         option = scan.nextInt();

        return option;
        }


        public static void cadastrarCliente(){

        List<Endereco> enderecos = new ArrayList<>();

        System.out.println("Insira o nome ");
       String nome = scan.next();
        System.out.println("Deseja cadastrar um endereco? ");
        System.out.println("1 - Sim \n 2 - Nao \n");
        int resp = scan.nextInt();
            while(resp == 1){
                System.out.println("Digite a rua");
                String rua = scan.next();
                System.out.println("Digite o numero");
                int numero = scan.nextInt();
                enderecos.add(new Endereco(rua,numero));
                System.out.println("Deseja cadastrar outro endereco? ");
                System.out.println("1 - Sim \n 2 - Nao \n");
                resp = scan.nextInt();

        }

    clientes.add(new Cliente(nome,enderecos));
    }


    public static Cliente listarClientes(){
        System.out.println("Escolha o cliente que realiza o pedido");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println((i+1) + " "+clientes.get(i).nome);
        }
        int idCliente = scan.nextInt();
        return clientes.get((idCliente-1));


    }

    public static Endereco listarEnderecos(Cliente cliente){
        System.out.println("Escolha o endereco da entrega ");
        for(int i = 0; i < cliente.enderecos.size(); i++){
            System.out.println((i+1) + " "+cliente.getEnderecos().get(i).rua + " Numero: " + cliente.getEnderecos().get(i).numero);
        }
        int idEnd = scan.nextInt();
        return cliente.getEnderecos().get((idEnd-1));


    }





    public static void realizarPedido(Cliente cliente, List<Produto> produtos, Endereco endereco) throws IOException {

        FileWriter arquivo = new FileWriter("C:\\Users\\Aluno 72\\Documents\\pedidos\\pedido.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);


        double  total_p = 0;
        int qtd = 0;
        System.out.println(cliente.nome);
        System.out.println("Por favor escolha o item a comprar");
        System.out.println("1 - "+ produtos.get(0).getProduto() + "\n");
        System.out.println("2 - "+ produtos.get(1).getProduto() + "\n");
        System.out.println("3 - "+ produtos.get(2).getProduto() + "\n");
        int item = scan.nextInt();
        int controle = 1;


        while(controle==1) {


            switch (item) {

                case 1:
                    System.out.println("Por favor escolha a quantidade");
                    qtd = scan.nextInt();
                    total_p = qtd * produtos.get(0).getPreco();
                    System.out.println("1 - Continuar comprando \n 0 - Finaliar pedido \n");
                    controle = scan.nextInt();

                    break;

                case 2:
                    System.out.println("Por favor escolha a quantidade");
                    qtd = scan.nextInt();
                    total_p = qtd * produtos.get(1).getPreco();
                    System.out.println("1 - Continuar comprando \n 0 - Finaliar pedido \n");
                    controle = scan.nextInt();

                    break;

                case 3:
                    System.out.println("Por favor escolha a quantidade");
                    qtd = scan.nextInt();
                    total_p = qtd * produtos.get(2).getPreco();
                    System.out.println("1 - Continuar comprando \n 0 - Finaliar pedido \n");
                    controle = scan.nextInt();

                    break;


                default:
                    System.out.println("Produto invalido");
            }


        }


        gravarArquivo.printf("Cliente: " + cliente.nome + " Endereco: " + endereco.rua + " " + endereco.numero +
                "\n" +" Produto: " + produtos.get((item-1)).getProduto());
        gravarArquivo.printf(" Quantidade: " + qtd + "\n");
        gravarArquivo.printf(" total do seu pedido é: ");
        gravarArquivo.print(total_p);
        arquivo.close();


    }




}



