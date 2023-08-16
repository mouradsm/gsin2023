package br.mil.gsin.poo.interfaces.pagamentos;

public class PicPay implements PagamentoInterface {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PicPay.");
    }
}
