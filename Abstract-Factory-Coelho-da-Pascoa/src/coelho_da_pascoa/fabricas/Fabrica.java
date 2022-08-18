/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas;

import coelho_da_pascoa.fabricas.ovos.Ovo;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Fabrica {

        public abstract Ovo criarOvo(String codigo);
}
