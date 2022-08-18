/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camisas_esportivas_de_times_factory_method.factory;

import camisas_esportivas_de_times_factory_method.camisas.Camiseta;
import camisas_esportivas_de_times_factory_method.camisas.Camiseta_Botafogo;
import camisas_esportivas_de_times_factory_method.camisas.Camiseta_Brasil;
import camisas_esportivas_de_times_factory_method.camisas.Camiseta_Flamengo;
import camisas_esportivas_de_times_factory_method.camisas.Camiseta_Fluminense;
import camisas_esportivas_de_times_factory_method.camisas.Camiseta_Vasco;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ConcretFactoryDeCamisetas implements I_FabricasDeCamisetas {

    @Override
    public Camiseta getCamiseta(String nomeTime_ou_Fabricante, String tamanho) {
        nomeTime_ou_Fabricante = nomeTime_ou_Fabricante.toUpperCase();

        if (!validarTamanho(tamanho)) {
            return null;
        }

        if (nomeTime_ou_Fabricante.equals("BOTAFOGO") || nomeTime_ou_Fabricante.equals("PUMA")) {
            return creatCamisaPuma(tamanho);
        }
        if (nomeTime_ou_Fabricante.equals("BRASIL") || nomeTime_ou_Fabricante.equals("NIKE")) {
            return creatCamisaNike(tamanho);
        }
        if (nomeTime_ou_Fabricante.equals("FLAMENGO") || nomeTime_ou_Fabricante.equals("ADIDAS")) {
            return creatCamisaAdidas(tamanho);
        }
        if (nomeTime_ou_Fabricante.equals("FLUMINENSE") || nomeTime_ou_Fabricante.equals("UMBRO")) {
            return creatCamisaUmbro(tamanho);
        }
        if (nomeTime_ou_Fabricante.equals("VASCO") || nomeTime_ou_Fabricante.equals("KAPPA")) {
            return creatCamisaKappa(tamanho);
        }
        return null;
    }

    private boolean validarTamanho(String tamanho) {
        String pattern = "[pP]{1,2}|[mM]{1}|[gG]{1,2}";
        return tamanho.matches(pattern);
    }

    @Override
    public Camiseta creatCamisaNike(String tamanho) {
        return new Camiseta_Brasil(tamanho);
    }

    @Override
    public Camiseta creatCamisaAdidas(String tamanho) {
        return new Camiseta_Flamengo(tamanho);
    }

    @Override
    public Camiseta creatCamisaPuma(String tamanho) {
        return new Camiseta_Botafogo(tamanho);
    }

    @Override
    public Camiseta creatCamisaUmbro(String tamanho) {
        return new Camiseta_Fluminense(tamanho);
    }

    @Override
    public Camiseta creatCamisaKappa(String tamanho) {
        return new Camiseta_Vasco(tamanho);
    }
}
