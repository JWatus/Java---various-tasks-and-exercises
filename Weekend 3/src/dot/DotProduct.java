package dot;

import java.util.stream.IntStream;

public class DotProduct {

    public static int dot(int[] a, int[] b) {

        return IntStream.range(0, a.length)
                .map( id -> a[id] * b[id])
                .sum();
    }

}

/*
    Write a function dot(int[] a, int[] b) -> int that calculates the dot product a · b, which is equal to the
        sum of the product of each respective element of a and b. For example, [1, 2, 3] · [4, 5, 6] = 1(4) + 2(5) + 3(6) = 32.

        Here's the catch: you only get one semicolon!

        Your algorithm will be tested with vectors of up to 100 elements. Good luck!*/
