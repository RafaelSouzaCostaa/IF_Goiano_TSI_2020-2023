/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package interfaces;

import coelho_da_pascoa.fabricas.ovos.garoto.OvoCrocante215g;
import coelho_da_pascoa.fabricas.ovos.garoto.OvoTalento350g;
import coelho_da_pascoa.fabricas.ovos.garoto.OvoBatomAoLeite172g;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_Fabrica_Garoto{
        
        public static String COD_OVO_CROCANTE215G = "ovoCrocante215g";
        public static String COD_OVO_TALENTO350G = "ovoTalen350g";
        public static String COD_OVO_BATON_AO_LEITE172G = "ovoBatonLeit172g";
        
        public static String NOME_TALENTO350G = "Talento 350g";
        public static String CARBOIDRATOS_TALENTO350G = "14g";
        public static String PROTEINAS_TALENTO350G = "2,4g (3%)";
        public static String GOLDURAS_TOTAIS_TALENTO350G = "8,0g (15%)";
        
        public static String NOME_BATON_AO_LEITE172G = "Baton ao leite 172g";
        public static String CARBOIDRATOS_BATON_AO_LEITE172G = "15g (5%)";
        public static String PROTEINAS_BATON_AO_LEITE172G = "1,3 g (2%)";
        public static String GOLDURAS_TOTAIS_BATON_AO_LEITE172G = "7,6g (14%)";
        
        public static String NOME_CROCANTE215G = "Crocante 215g";
        public static String CARBOIDRATOS_CROCANTE215G = "14g";
        public static String PROTEINAS_CROCANTE215G = "1.8g";
        public static String GOLDURAS_TOTAIS_CROCANTE215G = "7.8g";
        
       
         
        public OvoBatomAoLeite172g criarOvoBatomAoLeite172g();
        public OvoCrocante215g criarOvoCrocante215g();
        public OvoTalento350g criarOvoTalento350g();
}
