public class EntregaExpressa extends Pedidos_Entregas{

public EntregaExpressa (String destino) {
    super(destino);
}

    @Override
    public double CalcularFrete() {
        return 52.50;
    }

    @Override
    public String CalcularPrazo() {
        return "2 dias";
    }
}
