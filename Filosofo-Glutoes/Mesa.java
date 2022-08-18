import java.util.ArrayList;

public class Mesa {

    private static ArrayList<Filosofos> filosofos = new ArrayList<>();

    public static void setFilosofos(int qtdFilosofosNaMesa) {
        int indexFilosofo = 0;
        while(indexFilosofo < qtdFilosofosNaMesa){
            filosofos.add(new Filosofos(indexFilosofo));
            indexFilosofo++;
        }
    }

    public static boolean verificarStartAlimentar(int posicao){

        if(posicao == 0){
            if(filosofos.get(filosofos.size() - 1).getAlimentando() && filosofos.get(posicao + 1).getAlimentando()){
                return false;
            }
            return true;
        }else if(posicao == (filosofos.size() - 1 )){
            if(filosofos.get(posicao - 1).getAlimentando() && filosofos.get(0).getAlimentando()){
                return false;
            }
            return true;
        }else{
            if(filosofos.get(posicao - 1).getAlimentando() && filosofos.get(posicao + 1).getAlimentando()){
                return false;
            }
            return true;
        }
    }
    
    public static void endAlimentacao(int posicao){

        if(posicao == 0){
            filosofos.get(filosofos.size() - 1).setPensando();
            filosofos.get(posicao + 1).setPensando();
        }else if(posicao == (filosofos.size() - 1)){
            filosofos.get(posicao - 1).setPensando();
            filosofos.get(0).setPensando();
        }else{
            filosofos.get(posicao - 1).setPensando();
            filosofos.get(posicao + 1).setPensando();
        }
    }

    public static ArrayList<Filosofos> getFilosofos() {
        return filosofos;
    }
}
