package mu.rova.jasypt.guice;

import com.google.inject.AbstractModule;
import mu.rova.jasypt.Presenter;
import mu.rova.jasypt.PresenterImpl;
import mu.rova.jasypt.services.JasyptService;
import mu.rova.jasypt.services.JasyptServiceImpl;

/**
 *
 * @author andri
 */
public class GuiceMainModule extends AbstractModule {
    
    @Override
    protected void configure() {        
        bind(Presenter.class).to(PresenterImpl.class);
        bind(JasyptService.class).to(JasyptServiceImpl.class);
    }
    
}
