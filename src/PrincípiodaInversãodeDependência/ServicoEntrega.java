public class ServicoEntrega {
    private Transporte transporte;

    public ServicoEntrega(Transporte transporte) {
        this.transporte = transporte;
    }

    public void realizarEntrega(String endereco) {
        transporte.entregar(endereco);
    }
}