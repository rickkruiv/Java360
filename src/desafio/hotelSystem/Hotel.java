package desafio.hotelSystem;

import java.util.List;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private List<Quarto> rooms;
    
    public Hotel( String name ) {
        this.name  = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom( Quarto quarto ) {
        rooms.add( quarto );
    }
    
    public List<Quarto> getAvalibleRooms() {

        List<Quarto> avalibleRooms = new ArrayList<>();

        for ( Quarto quarto : rooms ) {
            if ( quarto.checkAvailability() ) { avalibleRooms.add( quarto ); }
        }
        
        return avalibleRooms;
    }

    public void bookRoom( Quarto quarto, Cliente cliente, int days ) {

        Reserva reserva = new Reserva( cliente, days );
        quarto.assignReservation( reserva );
        reserva.getReservationDetails();
    }
    
    public void cancelBooking( String name ) {
        
        for ( Quarto quarto : rooms ) {
            
            if ( quarto.getReservation() != null && quarto.getReservation().getCliente().getName().equalsIgnoreCase( name ) ) {
                quarto.freeRoom();
                System.out.println( "Reserva de " + name + " foi cancelada." );
                return;
            }
        }
        System.out.println( "Nenhuma reserva encontrada para " + name );
    }

    public String getName() {
        return name;
    }
}
