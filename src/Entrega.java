import java.util.Scanner;

class Entrega implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.print("Seu pedido foi entregue -> ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido entregue.");
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tudo ocorreu bem com o seu pedido? (sim ou nao)");
        String feedback = scanner.nextLine();

        if (feedback.equalsIgnoreCase("nao")) {
            pedido.setEstado(new Problema());
        } else {
            pedido.setEstado(new Concluido());
        }

        pedido.realizarAcao();
    }
}