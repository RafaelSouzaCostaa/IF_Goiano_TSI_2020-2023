/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas.fabricas;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaChevrolet;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosChevrolet.AstraSedan;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosChevrolet.Corsa;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosChevrolet.Silverado;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FabricaChevrolet implements I_FabricaChevrolet {

        @Override
        public Veiculo criarAstraSedan() {
                return new AstraSedan();
        }

        @Override
        public Veiculo criarCorsa() {
                return new Corsa();
        }

        @Override
        public Veiculo criarSilverado() {
                return new Silverado();
        }

        @Override
        public Veiculo criarVeiculo(String nome) {
                switch(nome){
                        case I_FabricaChevrolet.NOME_ASTRA_SEDAN:
                                return criarAstraSedan();
                        case I_FabricaChevrolet.NOME_CORSA:
                                return criarCorsa();
                        case I_FabricaChevrolet.NOME_SILVERADO:
                                return criarSilverado();
                        default: return null;
                }
        }

        @Override
        public String[] getVeiculosAtivosNome() {
                return veiculosAtivosNome;
        }
}
