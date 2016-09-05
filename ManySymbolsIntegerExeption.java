package Lesson3;

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
