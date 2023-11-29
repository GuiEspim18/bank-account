package br.com.fiap.bankv3.exceptions;

public class InvalidValueException extends RuntimeException{

    private final String message = "Valor inválido!";

    @Override
    public String getMessage() {
        return this.message;
    }

}
