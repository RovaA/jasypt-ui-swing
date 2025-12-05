package mu.rova.jasypt;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import javax.inject.Inject;
import mu.rova.jasypt.services.Data;
import mu.rova.jasypt.services.JasyptService;

/**
 *
 * @author andri
 */
public class PresenterImpl implements Presenter {
    
    @Inject
    private JasyptService jasyptService;

    @Override
    public String encrypt(Data data) {
        return jasyptService.encrypt(data);
    }

    @Override
    public String decrypt(Data data) {
        return jasyptService.decrypt(data);
    }

    @Override
    public void clipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Toolkit.getDefaultToolkit()
               .getSystemClipboard()
               .setContents(selection, null);
    }
    
}
