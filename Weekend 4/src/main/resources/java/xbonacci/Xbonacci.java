package main.resources.java.xbonacci;

import java.util.*;
import java.util.stream.Collectors;

public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {

        double[] returned = new double[n];
        List<Double> list = new LinkedList<>();

        if (n >= signature.length) {
            for (int i = 0; i < signature.length; i++) {
                returned[i] = signature[i];
                list.add(returned[i]);
            }

        } else if (n < signature.length) {
            for (int i = 0; i < n; i++) {
                returned[i] = signature[i];
                list.add(returned[i]);
            }
        }

        for (int i = signature.length; i < n; i++) {
            returned[i] = list.stream()
                    .collect(Collectors.collectingAndThen(Collectors.toList(),
                            lst -> {
                                Collections.reverse(lst);
                                return lst.stream();
                            }
                    ))
                    .limit(signature.length)
                    .mapToDouble(a -> a.doubleValue())
                    .sum();
            list.add(returned[i]);
        }
        return returned;
    }
}

//    public double[] xbonacci(double[] signature, int n) {
//
//        double[] returned = new double[n];
//
//        if (n >= signature.length) {
//            for (int i = 0; i < signature.length; i++) {
//                returned[i] = signature[i];
//            }
//
//        } else if (n < signature.length) {
//            for (int i = 0; i < n; i++) {
//                returned[i] = signature[i];
//            }
//        }
//
//        for (int i = signature.length; i < n; i++) {
//            for (int j = i - signature.length; j <= i - 1; j++) {
//                returned[i] = returned[i] + returned[j];
//            }
//        }
//
//        return returned;
//    }




