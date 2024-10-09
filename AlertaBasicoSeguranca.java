/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decorator_sistema_seguranca_notificacao;

/**
 *
 * @author rafaelamoreira
 */
public class AlertaBasicoSeguranca implements AlertaSeguranca{

    @Override
    public String notificacao(String message) {
        return "Alerta de Segurança Básico: " + message;
    }
    
}
