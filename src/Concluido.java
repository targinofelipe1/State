class Concluido implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.println("Pedido Finalizado.");
    }
}