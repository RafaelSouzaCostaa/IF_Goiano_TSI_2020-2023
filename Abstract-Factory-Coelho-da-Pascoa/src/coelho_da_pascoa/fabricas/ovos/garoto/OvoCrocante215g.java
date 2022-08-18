/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos.garoto;
import coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Garoto;

/**
 *
 * @author Rafael de Souza Costa
 */
public class OvoCrocante215g extends Ovo{

        public OvoCrocante215g() {
                super(I_Fabrica_Garoto.NOME_CROCANTE215G, 
                        I_Fabrica_Garoto.CARBOIDRATOS_CROCANTE215G, 
                        I_Fabrica_Garoto.PROTEINAS_CROCANTE215G, 
                        I_Fabrica_Garoto.GOLDURAS_TOTAIS_CROCANTE215G, 
                        I_Fabrica_Garoto.COD_OVO_CROCANTE215G);
        }

}
