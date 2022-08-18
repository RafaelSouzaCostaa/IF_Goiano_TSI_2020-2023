/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controle.de.matricula.interfaces;

import java.util.ArrayList;

/**
 * @author Rafael de Souza Costa
 */
public final class NivelDeFormacao {
    
    private static ArrayList<String> nivelFormacao;
    
    private static void carregarNivelPreConfig(){
        nivelFormacao.add("BACHARELADO");
        nivelFormacao.add("LICENCIATURA");
        nivelFormacao.add("GRADUAÇÃO TECNOLOGICA");    
    }
    
    private static void checkNiveisFormacao(){
        if(nivelFormacao == null){
            nivelFormacao = new ArrayList<>();
            carregarNivelPreConfig();
        }
    }
    
    public static ArrayList<String> retriaveAll(){
        checkNiveisFormacao();
        
        ArrayList<String> aux = new ArrayList<>();
        
        for(int i = 0; i < nivelFormacao.size(); i++){
            String formatString = i + " - " + nivelFormacao.get(i);
            aux.add(formatString);
        }
        return aux;
    }
    
    public static String retriave(int index){
        return nivelFormacao.get(index);
    }
    
    public static void addNivelDeFormacao(String nivel){
        nivelFormacao.add(nivel);
    }
}