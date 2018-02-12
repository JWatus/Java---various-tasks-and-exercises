package adder_factory;

import java.util.function.IntUnaryOperator;

public class AdderFactory {
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static IntUnaryOperator create(int addTo) {

        IntUnaryOperator f = n -> n + addTo;

        return f;

    }

/*    public static IntUnaryOperator create(int addTo) {

        IntUnaryOperator f = new IntUnaryOperator() {

            @Override
            public int applyAsInt(int n) {
                return  n + addTo;
            }
        };

        return f;

    }*/
}
