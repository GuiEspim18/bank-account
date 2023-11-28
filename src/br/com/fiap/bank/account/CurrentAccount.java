package br.com.fiap.bank.account;

import br.com.fiap.bank.Account;

import java.io.Serial;
import java.io.Serializable;

public class CurrentAccount extends Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 3L;

    private String type;
    private double check;

    public CurrentAccount () {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    public void setSpecialCheck(double value) {
        this.check = value;
    }

    public double getCurrentBalance() {
        return super.getBalance();
    }

    // polimorfismo um metodo que subescreve um metodo já existente na classe pai
    // precisa usar override @Override
    @Override
    public void withdrawal (double value) {
        super.withdrawal(value);
    }
}
