package br.com.fiap.bank;

public class Account {
    // protected pode ser utilizado por classes do mesmo pacote ou classes filhas
    protected int branch;
    protected int num;
    private double balance;

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

    public double getBalance() {
        return this.balance;
    }
}
