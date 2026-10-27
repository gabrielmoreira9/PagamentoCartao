public class PagamentoTest {
    public static void main (String[] args) {
     Pagamento pagamento = new PagamentoPix();
     ProcessadorPagamento processador = new ProcessadorPagamento(pagamento);
     System.out.println(processador.processar(100));

     pagamento  = new PagamentoCartao();
     processador = new ProcessadorPagamento(pagamento);
     System.out.println(processador.processar(100));

     pagamento = new PagamentoBoleto();
     processador = new ProcessadorPagamento(pagamento);
     System.out.println(processador.processar(100));

     pagamento = new PagamentoCrypto();
     processador = new ProcessadorPagamento(pagamento);
     System.out.println(processador.processar(100));
    }
}
