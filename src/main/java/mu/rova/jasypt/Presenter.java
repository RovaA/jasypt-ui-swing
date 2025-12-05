/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mu.rova.jasypt;

import mu.rova.jasypt.services.Data;

/**
 *
 * @author andri
 */
public interface Presenter {

    String encrypt(Data data);

    public String decrypt(Data data);

    void clipboard(String text);
    
}
