/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos.nestle;
import  coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Nestle;
/**
 *
 * @author Rafael de Souza Costa
 */
public class OvoClassic185g extends Ovo{

        public OvoClassic185g() {
                super(I_Fabrica_Nestle.NOME_CLASSIC185G, 
                        I_Fabrica_Nestle.CARBOIDRATOS_CLASSIC185G, 
                        I_Fabrica_Nestle.PROTEINAS_CLASSIC185G, 
                        I_Fabrica_Nestle.GOLDURAS_TOTAIS_CLASSIC185G, 
                        I_Fabrica_Nestle.COD_OVO_CLASSIC185G);
        }

}
