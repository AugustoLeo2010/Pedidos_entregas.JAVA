public class RetiradaNaLoja extends Entrega {

    public RetiradaNaLoja(String destino) {
        super(destino);
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    @Override
    public String calcularPrazo() {
        return "1 dia";
    }
}