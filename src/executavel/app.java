package executavel;

import entidades.Agenda;
import entidades.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static ArrayList<Agenda> agendas;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        agendas = new ArrayList<>();

        criarConta();
        criarConta();
        listar();
        remover();
        listar();

    }
    public static void criarConta(){
        System.out.println("Entre com o nome do endereço: ");
        String nome = sc.nextLine();


        System.out.println("Entre com a rua: ");
        String rua = sc.nextLine();
        System.out.println("Entre com o número: ");
        String numero = sc.next();
        System.out.println("Entre com o cep: ");
        sc.nextLine();
        String cep = sc.nextLine();
        Endereco endereco = new Endereco(rua, cep, numero);

       Agenda agenda = new Agenda(nome, endereco);
       agendas.add(agenda);


    }

    public static  void remover(){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);
        agenda.remover(nome);

    }
    public static void listar(){
        if (agendas.size() > 0){
            for (Agenda agenda: agendas ){
                System.out.println(agenda);
            }
        }
        else {
            System.out.println("Não deu certo");
        }
    }



}
