package DataBase.exceptions;

public class DbException extends  RuntimeException{
    private static final long serialVersionUid = 1L;

    public DbException(String msg){
        super(msg);
    }
}
