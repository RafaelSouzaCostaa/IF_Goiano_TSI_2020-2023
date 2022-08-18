import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Filosofos {
    
    private Boolean alimentando = false;
    private int posicaoFilosofo;

    public Filosofos(int posicao) {
        this.posicaoFilosofo = posicao;
        new Thread(filosofo01).start(); //Pensamento do Filosofo
    }

    public Boolean getAlimentando() {
        return this.alimentando;
    }

    public void setAlimentando() {
        this.alimentando = true;
    }

    public void setPensando() {
        this.alimentando = false;
    }

    public int getPosicaoFilosofo() {
        return this.posicaoFilosofo;
    }

    public void setPosicaoFilosofo(int posicaoFilosofo) {
        this.posicaoFilosofo = posicaoFilosofo;
    }

    private Runnable filosofo01 = new Runnable() {
        Timer timer = new Timer();
        Random gerador = new Random();
        int tempo = 2;

        @Override
        public void run() {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    if(getAlimentando()){
                        setPensando();
                    }else if(Mesa.verificarStartAlimentar(getPosicaoFilosofo())){
                        setAlimentando();
                        tempo = gerador.nextInt(4) + 1;
                        Mesa.endAlimentacao(getPosicaoFilosofo());
                    }
                }
            }, 0, (tempo * 1000));       
        }
    };
}
