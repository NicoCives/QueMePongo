package main.java.QMP4;

public class CategoriaInvalidaException extends RuntimeException{
  public CategoriaInvalidaException(String errorMessage) {
    super(errorMessage);
  }
}
