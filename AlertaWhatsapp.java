/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decorator_sistema_seguranca_notificacao;

/**
 *
 * @author rafaelamoreira
 */
public class AlertaWhatsapp extends Decorator{
    
    public AlertaWhatsapp(AlertaSeguranca wrappee) {
        super(wrappee);
    }
    @Override
    public String notificacao(String message) {
        return "Alerta Whatsapp("+super.notificacao(message)+")";
   
    }
    
}
