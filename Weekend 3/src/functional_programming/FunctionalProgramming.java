package functional_programming;

import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {

    public static ToDoubleFunction<Triangle> f = (triangle) -> {

        triangle.setArea((double) triangle.base * (double) triangle.height / 2);

        return triangle.getArea();
    };

/*
    public static ToDoubleFunction<Triangle> d = new ToDoubleFunction<Triangle>() {

        @Override
        public double applyAsDouble(Triangle triangle) {

            triangle.setArea((double) triangle.base * (double) triangle.height / 2);

            return triangle.getArea();
        }

    };
*/

    //Make me a function.
    //Don't use Function. Find the appropriate function to turn an
    //arbitrary class into a double. Remember the import.
}

