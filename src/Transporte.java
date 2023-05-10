class Transporte implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.print("Seu pedido está sendo transportado -> ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido transportado.");
        pedido.setEstado(new Entrega());
        pedido.realizarAcao();
    }
}