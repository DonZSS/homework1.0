package model;

public class WrongSizeException extends RuntimeException {

    public WrongSizeException(String wrongSize) {
        super(wrongSize);
    }
}
