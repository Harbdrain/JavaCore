package com.danil.javacore.chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Start");

        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("End");
    }
}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double a, b;

    Hypot(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt(a * a + b * b);
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;

        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}
