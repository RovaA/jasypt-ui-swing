/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mu.rova.jasypt;

import com.formdev.flatlaf.FlatLightLaf;
import com.google.inject.Guice;
import com.google.inject.Injector;
import mu.rova.jasypt.guice.GuiceMainModule;

/**
 *
 * @author andri
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatLightLaf.setup();
        
        Injector injector = Guice.createInjector(new GuiceMainModule());

        java.awt.EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setTitle("Jasypt");
            mainFrame.setPresenter(injector.getInstance(Presenter.class));
            mainFrame.setVisible(true);
        });
    }
    
}
