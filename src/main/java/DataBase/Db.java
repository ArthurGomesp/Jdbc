package DataBase;

import DataBase.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Db {
    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.prperties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }

    }
}
