package br.com.fiap.bank;

import java.io.Serial;
import java.io.Serializable;

public class Client implements Serializable {
    // Se usa java beans apenas nas classes que carregam dados

    @Serial private static final long serialVersionUID = 1L;

    private String name;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }
}
