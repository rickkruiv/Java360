package enumApps;

public class ExCalc {

    public interface Calculator {
        double Calculate( double valor1, double valor2 );        
    }
    
    public enum Operation implements Calculator {

        SUM( '+' ) {
            @Override
            public double Calculate(double valor1, double valor2) {
                return valor1 + valor2;
            }
        },
        SUBTRACT( '-' ) {
            @Override
            public double Calculate(double valor1, double valor2) {
                return valor1 - valor2;
            }
        },
        MULTIPLY( '*' ) {
            @Override
            public double Calculate(double valor1, double valor2) {
                return valor1 * valor2;
            }
        },
        DIVISION( '/' ) {
            @Override
            public double Calculate(double valor1, double valor2) {
                return valor1 / valor2;
            }
        };

        private final char symbol;

        Operation(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {
        
        System.out.println( "SOMA..........: " + "(" + Operation.SUM.toString()      + ") " + Operation.SUM.Calculate( 20, 10 ) );
        System.out.println( "SUBTRAÇÃO.....: " + "(" + Operation.SUBTRACT.toString() + ") " + Operation.SUBTRACT.Calculate( 20, 10 ) );
        System.out.println( "MULTIPLICAÇÃO.: " + "(" + Operation.MULTIPLY.toString() + ") " + Operation.MULTIPLY.Calculate( 20, 10 ) );
        System.out.println( "DIVISÃO.......: " + "(" + Operation.DIVISION.toString() + ") " + Operation.DIVISION.Calculate( 20, 10 ) );
    }
}
