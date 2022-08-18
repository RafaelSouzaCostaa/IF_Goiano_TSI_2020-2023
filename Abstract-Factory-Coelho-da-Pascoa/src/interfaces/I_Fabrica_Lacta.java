/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package interfaces;

import coelho_da_pascoa.fabricas.ovos.lacta.OvoSonhoDeValsa277g;
import coelho_da_pascoa.fabricas.ovos.lacta.OvoAoLeite170g;
import coelho_da_pascoa.fabricas.ovos.lacta.OvoOreo275g;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_Fabrica_Lacta{
        
        
        public static String COD_OVO_AO_LAITE170g = "ovoAoLeite170g";
        public static String COD_OVO_OREO275G = "ovoOreo275g";
        public static String COD_SONHO_DE_VALSA277G = "ovoSonDeVals277g";
        
        public static String NOME_AO_LAITE170g = "Ao Leite 170g";
        public static String CARBOIDRATOS_AO_LAITE170g = "14g";
        public static String PROTEINAS_AO_LAITE170g = "2,4g (3%)";
        public static String GOLDURAS_TOTAIS_AO_LAITE170g = "8,0g (15%)";
        
        public static String NOME_OREO275G = "Oreo 257g ";
        public static String CARBOIDRATOS_OREO275G = "15g (5%)";
        public static String PROTEINAS_OREO275G = "1,3 g (2%)";
        public static String GOLDURAS_TOTAIS_OREO275G = "7,6g (14%)";
        
        public static String NOME_SONHO_DE_VALSA277G = "Sonho de Valsa 277g";
        public static String CARBOIDRATOS_SONHO_DE_VALSA277G = "14g";
        public static String PROTEINAS_SONHO_DE_VALSA277G = "1.8g";
        public static String GOLDURAS_TOTAIS_SONHO_DE_VALSA277G = "7.8g";
        
        public OvoAoLeite170g criarOvoAoLeite170g();
        public OvoOreo275g criarOvoOreo275g();
        public OvoSonhoDeValsa277g criarOvoSonhoDeValsa277g();
}
