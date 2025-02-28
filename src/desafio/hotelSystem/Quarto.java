package desafio.hotelSystem;

public class Quarto {

    private int     number;
    private boolean isOccupied;
    private Reserva reservation;
    public Quarto() {
    }

    public Quarto( int number ) {
        this.number      = number;
        this.isOccupied  = false;
        this.reservation = null;
    }

    public boolean checkAvailability() {
        return !isOccupied;
    }

    public void assignReservation( Reserva reserva ) {

        if ( checkAvailability() ) {
            this.reservation = reserva;
            this.isOccupied  = true;
            System.out.println( "Reserva feita para " + reserva.getCliente().getName() );
        } else {
            System.out.println("Quarto " + number + " já está ocupado.");
        }
    }

    public void freeRoom() {
        if ( isOccupied ) {
            System.out.println("Reserva de " + reservation.getCliente().getName() + " cancelada.");
            this.isOccupied  = false;
            this.reservation = null;
        } else {
            System.out.println( "O quarto já está livre." );
        }
    }

    public Reserva getReservation() {
        return reservation;
    }
}
