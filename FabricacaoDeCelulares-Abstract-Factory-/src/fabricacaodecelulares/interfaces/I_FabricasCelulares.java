/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fabricacaodecelulares.interfaces;

import fabricacaodecelulares.celulares.Celular;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_FabricasCelulares {

    public Celular criarCelular(String tipoCelular);

    public String[] getModelosCelularAtivo();
}
