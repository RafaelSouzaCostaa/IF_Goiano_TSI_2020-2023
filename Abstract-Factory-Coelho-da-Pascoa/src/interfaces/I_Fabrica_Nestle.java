/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package interfaces;

import coelho_da_pascoa.fabricas.ovos.nestle.OvoAlpino337g;
import coelho_da_pascoa.fabricas.ovos.nestle.OvoClassic185g;
import coelho_da_pascoa.fabricas.ovos.nestle.OvoKitKat227g;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_Fabrica_Nestle{
        
        public static String COD_OVO_ALPINO337G = "ovoAlp337";
        public static String COD_OVO_CLASSIC185G = "ovoClass185";
        public static String COD_OVO_KITKAT227G = "ovoKitKat227";
        
        public static String NOME_ALPINO337G = "Alpino 337g";
        public static String CARBOIDRATOS_ALPINO337G = "13g (4%)";
        public static String PROTEINAS_ALPINO337G = "2,4g (3%)";
        public static String GOLDURAS_TOTAIS_ALPINO337G = "8,0g (15%)";
        
        public static String NOME_CLASSIC185G = "Classic 185g";
        public static String CARBOIDRATOS_CLASSIC185G = "15g (5%)";
        public static String PROTEINAS_CLASSIC185G = "1,3 g (2%)";
        public static String GOLDURAS_TOTAIS_CLASSIC185G = "7,6g (14%)";
        
        public static String NOME_KITKAT227G = "Kit Kat 227g";
        public static String CARBOIDRATOS_KITKAT227G = "13g (4%)";
        public static String PROTEINAS_KITKAT227G = "2,0g (3%)";
        public static String GOLDURAS_TOTAIS_KITKAT227G = "8,3g (15%)";
         
        public OvoAlpino337g criarOvoAlpino337g();
        public OvoClassic185g criarOvoClassic185g();
        public OvoKitKat227g criarOvoKitKat227g();
}
