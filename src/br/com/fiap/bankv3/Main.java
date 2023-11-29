package br.com.fiap.bankv3;

import br.com.fiap.bankv3.client.Client;
import br.com.fiap.bankv3.exceptions.EndException;
import br.com.fiap.bankv3.exceptions.InvalidValueException;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static Client client;


    public static void main (String[] args) {
        initialize();
        validation();
        scanner.close();
    }

    public static void initialize () {
        System.out.println("------Java Bank------");
        System.out.println("Olá, digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá, bem vindo (a) " + name);
    }

    public static void validation() {
        try {
            System.out.println("Você já possui conta no Java Bank? (S/N): ");
            String haveAccount = scanner.nextLine();
            if (validateResponse(haveAccount)) {
                throw new InvalidValueException();
            }
            if (Objects.equals(haveAccount.toUpperCase(), "S")) {
                login();
            } else {
                register();
            }
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        } catch (EndException e) {
            e.getMessage();
        } catch (Exception e) {
            System.out.println("Erro de execução!");
            e.printStackTrace();
        }
    }

    public static void login() {

    }


    public static void register() throws InvalidValueException, EndException {
        System.out.println("Gostaria de fazer o cadastro no nosso sistema? (S/N): ");
        String wantRegister = scanner.nextLine();
        if (validateResponse(wantRegister)) {
            throw new InvalidValueException();
        }

        // getting name
        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            throw new InvalidValueException();
        }

        // getting email
        System.out.println("Digite o seu email: ");
        String email = scanner.nextLine();
        if (email.isEmpty()) {
            throw new InvalidValueException();
        }

        // getting password
        System.out.println("Digite a sua senha: ");
        String password = scanner.nextLine();
        if (password.isEmpty()) {
            throw new InvalidValueException();
        }
        if (password.length() < 8) {
            System.out.println("Sua senha precisa ter ao menos 8 caracteres!");
            throw new EndException();
        }

        // getting passwordConfirm
        System.out.println("Digite a sua senha: ");
        String passwordRepeat = scanner.nextLine();
        if (passwordRepeat.isEmpty()) {
            throw new InvalidValueException();
        }
        if (!passwordRepeat.equals(password)) {
            System.out.println("Sua confirmação de senha precisa ser igual a senha digtada!");
            throw new EndException();
        }

        client = new Client(name, email, password);

    }


    public static boolean validateResponse(String response) {
        return (!Objects.equals(response.toUpperCase(), "S") && !Objects.equals(response.toUpperCase(), "N"));
    }

}
