public class Pedido {

    private int Numero;
    private String Cliente;
    private double ValorProduto;
    private double PesoTotal;
    Entrega entrega;

}

public Pedido(

  int Numero,
  String Cliente,
  double ValorProduto,
  double PesoTotal
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

}






