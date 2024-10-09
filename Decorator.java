/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decorator_sistema_seguranca_notificacao;

/**
 *
 * @author rafaelamoreira
 */
public class Decorator implements AlertaSeguranca{
    protected AlertaSeguranca wrappee;

    public Decorator(AlertaSeguranca wrappee) {
        this.wrappee = wrappee;
    }
    
    
    @Override
    public String notificacao(String message) {
        return wrappee.notificacao(message);
    }
    
}
