package desafio.hotelSystem;

public class Reserva {

    private Cliente cliente;
    private int     days;
    
    public Reserva( Cliente cliente, int days ) {
        this.cliente = cliente;
        this.days    = days;
    }

    public String getReservationDetails() {
        return String.format( "Cliente: %-20s\tEstadia: %d", cliente.getName(), days );
    }

    public Cliente getCliente() {
        return cliente;
    }

}
