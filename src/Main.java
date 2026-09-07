import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EntregaNormal normal =
                new EntregaNormal("São Paulo");

        EntregaExpressa expressa =
                new EntregaExpressa("São Paulo");

        RetiradaNaLoja retirada =
                new RetiradaNaLoja("São Paulo");

        EntregaAgendada agendada =
                new EntregaAgendada(
                        "São Paulo",
                        LocalDate.now().plusDays(10)
                );

        Pedido pedidoNormal =
                new Pedido(
                        10001,
                        "Renato Oliveira",
                        1299.90,
                        4.5,
                        normal
                );

        Pedido pedidoExpressa =
                new Pedido(
                        10002,
                        "Renato Oliveira",
                        1299.90,
                        4.5,
                        expressa
                );

        Pedido pedidoRetirada =
                new Pedido(
                        10003,
                        "Renato Oliveira",
                        1299.90,
                        4.5,
                        retirada
                );

        Pedido pedidoAgendada =
                new Pedido(
                        10004,
                        "Renato Oliveira",
                        1299.90,
                        4.5,
                        agendada
                );

        pedidoNormal.exibirResumo();
        pedidoExpressa.exibirResumo();
        pedidoRetirada.exibirResumo();
        pedidoAgendada.exibirResumo();


        System.out.println("\n===== COMPARAÇÃO DAS MODALIDADES =====");

        double valorProdutos = 1299.90;
        double peso = 4.5;

        Pedido comparacaoNormal = new Pedido(
                20001,
                "Renato Oliveira",
                valorProdutos,
                peso,
                new EntregaNormal("São Paulo")
        );

        Pedido comparacaoExpressa = new Pedido(
                20001,
                "Renato Oliveira",
                valorProdutos,
                peso,
                new EntregaExpressa("São Paulo")
        );

        Pedido comparacaoRetirada = new Pedido(
                20001,
                "Renato Oliveira",
                valorProdutos,
                peso,
                new RetiradaNaLoja("São Paulo")
        );

        Pedido comparacaoAgendada = new Pedido(
                20001,
                "Renato Oliveira",
                valorProdutos,
                peso,
                new EntregaAgendada(
                        "São Paulo",
                        LocalDate.now().plusDays(10)
                )
        );

        comparacaoNormal.exibirResumo();
        comparacaoExpressa.exibirResumo();
        comparacaoRetirada.exibirResumo();
        comparacaoAgendada.exibirResumo();

    }
}
