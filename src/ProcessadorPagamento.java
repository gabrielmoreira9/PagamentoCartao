public class ProcessadorPagamento {
    private Pagamento pagamento;

    public ProcessadorPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public double processar(double valor){
        return pagamento.calcularValor(valor);
    }
}
