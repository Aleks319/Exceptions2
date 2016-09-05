package Lesson3;

/**
 * Created by Sasha on 05.09.2016.
 */
public class ManySymbolsIntegerExeption extends IntegerExeption{

    private String message;

    public ManySymbolsIntegerExeption() {
        super();
    }

    public ManySymbolsIntegerExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

