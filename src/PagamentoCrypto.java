public class PagamentoCrypto implements Pagamento {

    @Override
    public double calcularValor(double valor) {
        return valor * 1.05;
    }
}
