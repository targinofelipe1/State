class Preparo implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.print("Seu pedido está sendo preparado -> ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido preparado.");
        pedido.setEstado(new Transporte());
        pedido.realizarAcao();
    }
}