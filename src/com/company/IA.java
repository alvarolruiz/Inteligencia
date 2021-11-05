package com.company;

public class IA  implements Runnable{
    public String nombre;
    public int id;

    public IA(String nombre, int id) {
        this.nombre = nombre;
        this.id=id;
    }

    @Override
    public void run() {
        try{
            System.out.println(String.format("Calculando IA %s", nombre));
            Thread.sleep(1000);
            System.out.println("Calculos IA realizados");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
