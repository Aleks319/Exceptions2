package Lesson3;

public class WrongFormatIntegerExeption extends IntegerExeption {
    private String message;

    public WrongFormatIntegerExeption() {
        super();
    }

    public WrongFormatIntegerExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    }

