import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja fazer um pedido? (sim ou nao)");
        String answer = scanner.nextLine();


        System.out.println("****************************");
        System.out.println("Iniciando um pedido");
        System.out.println("****************************");


        Pedido pedido = new Pedido();

        pedido.iniciarPedido();
    }
}