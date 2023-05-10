
class Problema implements Estado {
    @Override
    public void realizarAcao(Pedido pedido) {
        System.out.println("Pedimos desculpas pelo inconveniente.");
        pedido.setEstado(new Concluido());
        pedido.realizarAcao();
    }
}