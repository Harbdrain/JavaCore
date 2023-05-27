package com.danil.javacore.chapter15;

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array is empty");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        DoubleNumericArrayFunc average = (a) -> {
            if (a.length == 0) {
                throw new EmptyArrayException();
            }
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum / a.length;
        };

        System.out.println(average.func(values));
        System.out.println(average.func(new double[0]));
    }
}
