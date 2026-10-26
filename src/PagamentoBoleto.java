public class PagamentoBoleto implements Pagamento{

    @Override
    public double calcularValor(double valor){
        return valor + 2.50;
    }
}
