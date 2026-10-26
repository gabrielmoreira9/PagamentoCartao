public class PagamentoTest {
    public static void main (String[] args) {
     Pagamento pagamento = new PagamentoCartao();
     System.out.println(pagamento.calcularValor(100));

     pagamento = new PagamentoBoleto();
     System.out.println(pagamento.calcularValor(100));

     pagamento = new PagamentoPix();
     System.out.println(pagamento.calcularValor(100));
    }
}
