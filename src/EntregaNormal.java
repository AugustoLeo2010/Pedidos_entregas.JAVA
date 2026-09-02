public class EntregaNormal extends Pedidos_Entregas {


    public EntregaNormal (String destino) {
        super(destino);
    }

    @Override
    public double CalcularFrete() {
        return 21.00;
    }

    @Override
    public String CalcularPrazo() {
        return "7 dias";
    }

}
