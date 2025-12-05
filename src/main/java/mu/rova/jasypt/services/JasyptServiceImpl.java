package mu.rova.jasypt.services;

import java.util.logging.Logger;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

/**
 *
 * @author andri
 */
public class JasyptServiceImpl implements JasyptService {

    @Override
    public String encrypt(Data data) {
        StandardPBEStringEncryptor encryptor = newStringEncryptor(data);
        return encryptor.encrypt(data.getInput());
    }

    @Override
    public String decrypt(Data data) {
        StandardPBEStringEncryptor encryptor = newStringEncryptor(data);
        return encryptor.decrypt(data.getInput().trim());
    }

    private StandardPBEStringEncryptor newStringEncryptor(Data data) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(data.getPassword().trim());
        encryptor.setAlgorithm(data.getAlgorithm().toString().trim());
        if (JasyptAlgorithm.PBEWithHMACSHA512AndAES_256 == data.getAlgorithm()) {
            encryptor.setIvGenerator(new RandomIvGenerator());
        }
        return encryptor;
    }

}
