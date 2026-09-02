public class RetiradaNaLoja extends Pedidos_Entregas{

public RetiradaNaLoja(String destino) {
    super(destino);
}

    @Override
    public String CalcularPrazo() {
        return "1 dias";
    }

    @Override
    public double CalcularFrete() {
        return 0;
    }
}
