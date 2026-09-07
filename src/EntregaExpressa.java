public class EntregaExpressa extends Entrega {

    public EntregaExpressa(String destino) {
        super(destino);
    }

    @Override
    public double calcularFrete() {
        return 52.50;
    }

    @Override
    public String calcularPrazo() {
        return "2 dias";
    }
}