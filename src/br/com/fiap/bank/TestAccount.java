package br.com.fiap.bank;

import br.com.fiap.bank.account.CurrentAccount;

public class TestAccount {
    // Static significa que eu não preciso usar um objeto em memória para trabalhar com ele
    public static void main(String[] args) {
        Account account = new Account(2002, 1803, 50);

        account.deposit(50);
        account.setNum(2002);
        account.setBranch(1803);


        //        System.out.println(account.getBranch());
        //        System.out.println(account.getNUm());
        //        System.out.println(account.getBalance());

        account.withdrawal(30);

        //        System.out.println(account.getBalance());

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setNum(2002);
        currentAccount.setBranch(1803);
        currentAccount.setType("PF");
        currentAccount.setCheck(100.0);
        currentAccount.setBalance(100.0);
        currentAccount.withdrawal(10.0);
        System.out.println(currentAccount.getCurrentBalance());

        // covertendo a classe e forçando ela a ser uma classe de conta corrente
        CurrentAccount account1 = (CurrentAccount) currentAccount;
    }
}
