/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package camisas_esportivas_de_times_factory_method.factory;

import camisas_esportivas_de_times_factory_method.camisas.Camiseta;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_FabricasDeCamisetas {

    public Camiseta getCamiseta(String nomeTime_ou_Fabricante, String tamanho);
    
    public Camiseta creatCamisaNike(String tamanho);
    public Camiseta creatCamisaAdidas(String tamanho);
    public Camiseta creatCamisaPuma(String tamanho);
    public Camiseta creatCamisaUmbro(String tamanho);
    public Camiseta creatCamisaKappa(String tamanho);
}
