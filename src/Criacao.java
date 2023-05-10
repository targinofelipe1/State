class Criacao implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.print("Seu pedido está sendo criado -> ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido criado.");
        pedido.setEstado(new Preparo());
        pedido.realizarAcao();
    }
}