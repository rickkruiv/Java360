package stringFormat.format;

import java.text.NumberFormat;
import java.util.Currency;

public class Item {

    private final String descricao;
    private final double preco;
    private final NumberFormat numberFormat;

    public Item( String descricao, double preco, String currency ) {
        this.descricao = descricao;
        this.preco     = preco;

        numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setCurrency( Currency.getInstance( currency ) );
    }

    @Override
    public String toString() {
        return String.format( "%-15s - %15s", descricao, numberFormat.format( preco ) ) ;
    }
}
