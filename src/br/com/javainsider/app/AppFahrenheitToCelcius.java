package br.com.javainsider.app;

public class AppFahrenheitToCelcius {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner( System.in );

        System.out.print( "Insira a temperatura em Fahrenheit: " );
        double tFahrenheit = Double.parseDouble( scanner.nextLine() );

        double tCelsius = ( tFahrenheit - 32 ) / 9 * 5;

        System.out.println( "Temperatura em Celsius: " + String.format( "%.1f", tCelsius ) + "°C" );

        scanner.close();
        
    }

}