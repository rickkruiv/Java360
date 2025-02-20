package wrappers;

public class OperationImpl implements Operation {

    @Override
    public int Execute(Integer valor1, Integer valor2) {
        return ( valor1 == null ? 0 : valor1 ) + ( valor2 == null ? 0 : valor2 );
    }
}
