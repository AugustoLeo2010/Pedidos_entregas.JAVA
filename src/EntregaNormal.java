public class EntregaNormal extends Entrega {

    public EntregaNormal(String destino) {
        super(destino);
    }

    @Override
    public double calcularFrete() {
        return 21.00;
    }

    @Override
    public String calcularPrazo() {
        return "7 dias";
    }
}
