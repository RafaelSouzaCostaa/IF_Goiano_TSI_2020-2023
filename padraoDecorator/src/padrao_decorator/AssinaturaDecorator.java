/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao_decorator;

/**
 *
 * @author Rafael de Souza Costa
 */
public class AssinaturaDecorator implements I_Assinatura {

    public I_Assinatura assinatura;
    public double valor = 0.0;

    public AssinaturaDecorator(I_Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void assinar() {
        assinatura.assinar();
    }

    public I_Assinatura getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(I_Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
