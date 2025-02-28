package desafio.hotelSystem;

public class HotelApp {

    public static void main( String[] args ) {
        Hotel hotel = new Hotel( "Grand Hotel" );

        Quarto quarto1 = new Quarto( 101 );
        Quarto quarto2 = new Quarto( 102 );
        
        hotel.addRoom( quarto1 );
        hotel.addRoom( quarto2 );

        Cliente cliente = new Cliente( "Maria" );
        quarto1.assignReservation(new Reserva( cliente, 5 ) );

        hotel.cancelBooking( "Maria" );
        hotel.cancelBooking( "João"  );
    }
}
