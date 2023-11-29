package br.com.fiap.bankv3.client;

import br.com.fiap.bankv2.Account;

import java.io.Serial;
import java.io.Serializable;

public class Client implements Serializable {
    @Serial private static final long serialVersionUID = 5L;

    private String name;
    private String email;
    private String password;
    private Account account;

    public Client() {

    }

    public Client(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
