class Pedido {
    private Estado estado;

    public Pedido() {
        this.estado = new Criacao();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void iniciarPedido() {
        this.estado.realizarAcao(this);
    }

    public void realizarAcao() {
        this.estado.realizarAcao(this);
    }

}