public abstract class Entrega {

    private String destino;

    public Entrega(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("O destino não pode ser vazio.");
        }

        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public abstract double calcularFrete();

    public abstract String calcularPrazo();
}
