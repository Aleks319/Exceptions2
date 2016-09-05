package Lesson3;

/**
 * Created by Sasha on 04.09.2016.
 */
public class MyInt {
    public static int parseInt(String str)  {
        boolean isPositive = false;
        int contMax = 0;
        int i = 0;
        long result = 0;
        long preresult = 0;

        if(str.charAt(0) == '-') {
            isPositive = false;
        } else {
            isPositive = true;
        }
        if(str == null) {
            throw new NullPointerException();
        }

        if(str.charAt(0) == '+' || isPositive == false) {
            contMax = 11;
            i = 1;
        } else {
            contMax = 10;
        }

        if(str.length()>contMax) {
            throw new ManySymbolsIntegerExeption("Integer can contain no more than 10 digits!");
        }

        int mult = (i==0) ? (int)Math.pow(10, str.length()-1) : (int)Math.pow(10, str.length()-2);

        for(int j = i; j < str.length(); j++) {
            if(!isInt(str.charAt(j))) {
                throw new WrongFormatIntegerExeption("Input String must contain only digits!");
            }
        }

        for (int j = i; j<str.length(); j++) {
            preresult = (long) charToInt(str.charAt(j))*mult;
            mult /= 10;
            result = result + preresult;
        }

        if((isPositive && (result > (long)Integer.MAX_VALUE)) || (!isPositive && (-result < (long)Integer.MIN_VALUE))) {
            throw new ArithmeticException("Integer overflow!");
        } else {
            if(isPositive) {
                return (int)result;
            } else {
                return (int)-result;
            }
        }
    }

    public static boolean isInt(char c) {
        if(c>='0' && c<='9') {
            return true;
        }
        return false;
    }

    public static int charToInt(char c)  {
        if(c>='0' && c<= '9') {
            return ((int) (c - 48));
        } else {
            throw new WrongFormatIntegerExeption("Input character must be digit from '0' to '9' !");
        }
    }
}
