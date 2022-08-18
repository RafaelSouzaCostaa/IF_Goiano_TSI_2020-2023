/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas;

import coelho_da_pascoa.fabricas.ovos.Ovo;
import coelho_da_pascoa.fabricas.ovos.nestle.OvoAlpino337g;
import coelho_da_pascoa.fabricas.ovos.nestle.OvoClassic185g;
import coelho_da_pascoa.fabricas.ovos.nestle.OvoKitKat227g;
import interfaces.I_Fabrica_Nestle;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Fabrica_Nestle extends Fabrica implements I_Fabrica_Nestle{

        @Override
        public OvoAlpino337g criarOvoAlpino337g() {
                return new OvoAlpino337g();
        }

        @Override
        public OvoClassic185g criarOvoClassic185g() {
                return new OvoClassic185g();
        }

        @Override
        public OvoKitKat227g criarOvoKitKat227g() {
                return new OvoKitKat227g();
        }

        @Override
        public Ovo criarOvo(String codigo) {
                switch(codigo){
                        case I_Fabrica_Nestle.COD_OVO_ALPINO337G:
                                return criarOvoAlpino337g();
                        case I_Fabrica_Nestle.COD_OVO_CLASSIC185G:
                                return criarOvoClassic185g();
                        case I_Fabrica_Nestle.COD_OVO_KITKAT227G:
                                return criarOvoKitKat227g();
                        default:
                                return null;
                }
        }

}
