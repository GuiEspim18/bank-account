package br.com.fiap.bank;

import java.io.Serial;
import java.io.Serializable;

/**
 * Classe que abstrai uma conta bancária
 * @author Guilherme Espim
 * @version 1.0.0
 */

public class Account implements Serializable {
    // Se usa java beans apenas nas classes que carregam dados

    @Serial private static final long serialVersionUID = 1L;

    // protected pode ser utilizado por classes do mesmo pacote ou classes filhas
    private int branch;
    private int num;
    private double balance;
    Client client = new Client();

    /*
        caso eu queira chamar a classe sem passar nenhum parâmetro no construtor
        public Account () {
        }
    */

    public Account (int branch, int num, double balance) {
        this.branch = branch;
        this.num = num;
        this.balance = balance;
    }

    public void deposit(double value) {
        // this.balance += value;
        this.balance = this.balance + value;
    }

    public void withdrawal(double value) {
        if (this.balance > 0) {
            // this.balance -= value;
            this.balance = this.balance - value;
        }
    }

    public void setClient(String name) {
        this.client.setName(name);
    }

    public void setBranch (int branch) {
        this.branch = branch;
    }

    public int getBranch () {
        return this.branch;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public int getNUm() {
        return this.num;
    }

    public double getBalance() {
        return this.balance;
    }
}
