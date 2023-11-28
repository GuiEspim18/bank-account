package br.com.fiap.bank;

public class TestAccount {
    // Static significa que eu não preciso usar um objeto em memória para trabalhar com ele
    public static void main(String[] args) {
        Account account = new Account(2002, 1803, 50);

        account.deposit(50);
        account.setNum(2002);
        account.setBranch(1803);


        System.out.println(account.getBranch());
        System.out.println(account.getNUm());
        System.out.println(account.getBalance());

        account.withdrawal(30);

        System.out.println(account.getBalance());

    }
}
