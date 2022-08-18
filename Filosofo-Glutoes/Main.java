import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        
        Mesa.setFilosofos(5);       

        new Thread(printResultado).start();
    }

    private static Runnable printResultado = new Runnable() {
        Timer timer = new Timer();
        
        @Override
        public void run() {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println("\n\n\n\n\n\n\n\n\n + + + + + + + + + + + + + + + + + + + +");
                    Mesa.getFilosofos().forEach((Filosofos filosofo) -> {
                        if(filosofo.getAlimentando()){
                            System.out.println("Filosofo " + (filosofo.getPosicaoFilosofo() + 1) + ": Alimentando-se");
                        }else{
                            System.out.println("Filosofo " + (filosofo.getPosicaoFilosofo() + 1) + ": Pensando");
                        }
                    });
                }
            }, 0, 6000);
        }
    };
}

