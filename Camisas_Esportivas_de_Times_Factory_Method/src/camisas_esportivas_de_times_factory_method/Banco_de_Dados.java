/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camisas_esportivas_de_times_factory_method;

import camisas_esportivas_de_times_factory_method.camisas.Camiseta;
import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Banco_de_Dados {

    private static ArrayList<Camiseta> camisetas = new ArrayList<>();

    public static ArrayList<Camiseta> getCamisetas() {
        return camisetas;
    }

    public static Camiseta getCamiseta(int index) {
        return camisetas.get(index);
    }
    
    public static Camiseta deleteCamiseta(int index) {
        return camisetas.remove(index);
    }

    public static void setCamisetas(Camiseta camiseta) {
        camisetas.add(camiseta);
    }

}
