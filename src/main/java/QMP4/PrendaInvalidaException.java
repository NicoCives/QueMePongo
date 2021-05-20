package main.java.QMP4;

public class PrendaInvalidaException extends RuntimeException{
  public PrendaInvalidaException(String errorMessage) {
    super(errorMessage);
  }
}
