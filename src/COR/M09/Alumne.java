package COR.M09;

import java.util.concurrent.Callable;

public class Alumne implements Callable<Integer> {
    private String nom;
    private int nota;

    public int examinar() {
        try {
            Thread.sleep((long) (1000 + Math.random()*2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (int) (Math.random()*10);
    }

    @Override
    public Integer call() throws Exception {
        return examinar();
    }
}
