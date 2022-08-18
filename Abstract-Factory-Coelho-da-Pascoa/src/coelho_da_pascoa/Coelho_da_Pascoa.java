/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package coelho_da_pascoa;

import coelho_da_pascoa.fabricas.Fabrica;
import coelho_da_pascoa.fabricas.Fabrica_Garoto;
import coelho_da_pascoa.fabricas.Fabrica_Lacta;
import coelho_da_pascoa.fabricas.Fabrica_Nestle;
import coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Garoto;
import interfaces.I_Fabrica_Lacta;
import interfaces.I_Fabrica_Nestle;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Coelho_da_Pascoa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabricaNestle = new Fabrica_Nestle();
        Fabrica fabricaGaroto = new Fabrica_Garoto();
        Fabrica fabricaLacta = new Fabrica_Lacta();
        
        Ovo ovo;
        
       System.out.println(" Fabrica Nestle \n");
        
        ovo = fabricaNestle.criarOvo(I_Fabrica_Nestle.COD_OVO_ALPINO337G);
                print.dadosOvo(ovo);
                
        ovo = fabricaNestle.criarOvo(I_Fabrica_Nestle.COD_OVO_CLASSIC185G);
                print.dadosOvo(ovo);
                
        ovo = fabricaNestle.criarOvo(I_Fabrica_Nestle.COD_OVO_KITKAT227G);
                print.dadosOvo(ovo);
                
       System.out.println("\n\n Fabrica Garoto \n");
            
        ovo = fabricaGaroto.criarOvo(I_Fabrica_Garoto.COD_OVO_BATON_AO_LEITE172G);
                print.dadosOvo(ovo);
                
        ovo = fabricaGaroto.criarOvo(I_Fabrica_Garoto.COD_OVO_CROCANTE215G);
                print.dadosOvo(ovo);
                
        ovo = fabricaGaroto.criarOvo(I_Fabrica_Garoto.COD_OVO_TALENTO350G);
                print.dadosOvo(ovo);
        
        System.out.println("\n\n Fabrica Lacta \n");
        
        ovo = fabricaLacta.criarOvo(I_Fabrica_Lacta.COD_OVO_AO_LAITE170g);
                print.dadosOvo(ovo);
                
        ovo = fabricaLacta.criarOvo(I_Fabrica_Lacta.COD_OVO_OREO275G);
                print.dadosOvo(ovo);
                
        ovo = fabricaLacta.criarOvo(I_Fabrica_Lacta.COD_SONHO_DE_VALSA277G);
                print.dadosOvo(ovo);
    }
}
