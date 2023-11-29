package br.com.fiap.bankv2.test;

import br.com.fiap.bankv2.currentAccount.CurrentAccount;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        CurrentAccount heloisaAccount = new CurrentAccount();
        heloisaAccount.setClientName("Heloísa");
        heloisaAccount.setClientAge((byte) 20);
        heloisaAccount.setBalance((float) 1000);
        heloisaAccount.setType("CPF");

        CurrentAccount guilhermeAccount = new CurrentAccount();
        guilhermeAccount.setClientName("Guilherme");
        guilhermeAccount.setClientAge((byte) 21);
        guilhermeAccount.setBalance((float) 500);
        guilhermeAccount.setType("CNPJ");

        Map<String, CurrentAccount> accounts = new HashMap<String, CurrentAccount>();
        accounts.put("ACC1", heloisaAccount);
        accounts.put("ACC2", guilhermeAccount);

        for (int index = 1; index <= accounts.size(); index++) {
            String accountNumber = "ACC" + index;
            CurrentAccount found = accounts.get(accountNumber);
            System.out.println("----------------------------------");
            System.out.println("Nome: "+ found.getClientName());
            System.out.println("Idade: " + found.getClientAge());
            System.out.println("Tipo de conta: " + found.getType());
            System.out.println("Saldo: " + found.getBalance());
            found.withdrawal(100);
            System.out.println("Saldo Atual: " + found.getBalance());

        }

    }
}
