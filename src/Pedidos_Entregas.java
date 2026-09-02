public abstract class Pedidos_Entregas {

protected String destino;

public Pedidos_Entregas (String destino){
    this.destino = destino;
}

public abstract double CalcularFrete();

public abstract String CalcularPrazo();

}

