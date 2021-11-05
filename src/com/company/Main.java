package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Es necesario que el hilo tenga como parámetro la instancia de una clase que implemente Runnable
        Thread h1 = new Thread(new IA("h1",1));
        Thread h2 = new Thread(new IA("h2",2));


        Thread[]hilos = new Thread[Runtime.getRuntime().availableProcessors()];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i]=new Thread(new IA("h"+String.valueOf(i+1),(i+1)));
        }
        for (Thread hilo: hilos
             ) {
            hilo.start();
        }

        for (Thread hilo: hilos
        ) {
            try {
                hilo.join();
                System.out.println(Runtime.getRuntime().availableProcessors());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Obtiene el numero de procesadores disponibles


    }
}
