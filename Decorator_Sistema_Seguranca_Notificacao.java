/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.decorator_sistema_seguranca_notificacao;

/**
 *
 * @author rafaelamoreira
 */
public class Decorator_Sistema_Seguranca_Notificacao {

    public static void main(String[] args) {
        String message = "Intruso detectado";
        // Notificacao Basica
        AlertaSeguranca alertaBasico = new AlertaBasicoSeguranca();
        System.out.println(alertaBasico.notificacao(message));
        // Notificacao por SMS
        AlertaSeguranca alertaSMS = new AlertaSMS(new AlertaBasicoSeguranca());
        System.out.println(alertaSMS.notificacao(message));
        // Notificacao por Whatsapp
        AlertaSeguranca alertaWhatsapp = new AlertaWhatsapp(new AlertaBasicoSeguranca());
        System.out.println(alertaWhatsapp.notificacao(message));
        
        // Notificacao por Email
        AlertaSeguranca alertaEmail = new AlertaEmail(new AlertaBasicoSeguranca());
        System.out.println(alertaEmail.notificacao(message));
        
        // Notificacao por SMS+Whatsapp
        AlertaSeguranca alertaSMSWhatsapp = new AlertaSMS(new AlertaWhatsapp(new AlertaBasicoSeguranca()));
        System.out.println(alertaSMSWhatsapp.notificacao(message));
        
        // Notificacao por SMS+Email
        AlertaSeguranca alertaSMSEmail = new AlertaSMS(new AlertaEmail(new AlertaBasicoSeguranca()));
        System.out.println(alertaSMSEmail.notificacao(message));
        // Notificacao por SMS+Whatsapp+Email
        AlertaSeguranca alertaSMSWhatsappEmail = new AlertaSMS(new AlertaWhatsapp(new AlertaEmail(new AlertaBasicoSeguranca())));
        System.out.println(alertaSMSWhatsappEmail.notificacao(message));
        // Notificacao por Whatsapp+Email
        AlertaSeguranca alertaWhatsappEmail = new AlertaEmail(new AlertaWhatsapp(new AlertaBasicoSeguranca()));
        System.out.println(alertaWhatsappEmail.notificacao(message));
        
        
        }
}
