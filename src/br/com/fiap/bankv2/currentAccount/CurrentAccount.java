package br.com.fiap.bankv2.currentAccount;

import br.com.fiap.bankv2.Account;

import java.io.Serial;
import java.io.Serializable;

public class CurrentAccount extends Account implements Serializable {
    @Serial private static final long serialVersionUID = 4L;

    public CurrentAccount () {
        super();
    }

    private double check;
    private String type;

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void withdrawal (float value) {
        super.withdrawal(value);
    }
}
