import java.time.LocalDate;

public class EntregaAgendada extends Entrega {

    private LocalDate dataEntrega;

    public EntregaAgendada(String destino, LocalDate dataEntrega) {
        super(destino);

        if (dataEntrega.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "A data de entrega não pode ser anterior ao dia atual."
            );
        }

        this.dataEntrega = dataEntrega;
    }

    @Override
    public double calcularFrete() {
        return 30.00;
    }

    @Override
    public String calcularPrazo() {
        return "Data escolhida: " + dataEntrega;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
}
