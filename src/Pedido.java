public class Pedido {

    private int Numero;
    private String Cliente;
    private double ValorProduto;
    private double PesoTotal;
    private Entrega entrega;

    public Pedido(
            int Numero,
            String Cliente,
            double ValorProduto,
            double PesoTotal,
            Entrega entrega
    ) {

        if (ValorProduto <= 0) {
            throw new IllegalArgumentException(
                    "Valor dos produtos deve ser maior que 0"
            );
        }

        if (PesoTotal <= 0) {
            throw new IllegalArgumentException(
                    "Peso deve ser maior que 0"
            );
        }

        if (entrega == null) {
            throw new IllegalArgumentException(
                    "A modalidade de entrega é obrigatória"
            );
        }

        this.Numero = Numero;
        this.Cliente = Cliente;
        this.ValorProduto = ValorProduto;
        this.PesoTotal = PesoTotal;
        this.entrega = entrega;
    }

    public double calcularFrete() {
        return entrega.calcularFrete();
    }

    public double calcularTotal() {
        return ValorProduto + calcularFrete();
    }

    public void exibirResumo() {
        System.out.println("--------------------------------------------");
        System.out.println("Pedido: " + Numero);
        System.out.println("Cliente: " + Cliente);
        System.out.println("Modalidade: " + entrega.getClass().getSimpleName());
        System.out.printf("Produtos: R$ %.2f%n", ValorProduto);
        System.out.printf("Peso: %.2f kg%n", PesoTotal);
        System.out.printf("Frete: R$ %.2f%n", calcularFrete());
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
        System.out.println("Prazo: " + entrega.calcularPrazo());
        System.out.println("--------------------------------------------");
    }
}




