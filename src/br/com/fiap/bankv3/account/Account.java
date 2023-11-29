package br.com.fiap.bankv3.account;

import br.com.fiap.bankv3.client.Client;

import java.io.Serial;
import java.io.Serializable;

public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 5L;

    public Account() {
    }

    private float balance;
    private final Client client = new Client();

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void withdrawal(float value) {
        if (balance > 0 && value <= balance) {
            this.balance -= value;
        }
    }

    public void setClientName (String name) {
        this.client.setName(name);
    }

    public String getClientName () {
        return this.client.getName();
    }
}
