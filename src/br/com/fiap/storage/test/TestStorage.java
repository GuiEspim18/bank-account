package br.com.fiap.storage.test;

import br.com.fiap.storage.Storage;

public class TestStorage {

    public static void main (String[] args) {
        Storage storage = new Storage();
        storage.setComputer(10);

        System.out.println(storage.getComputer());

        storage.reduceStorage(5);

        System.out.println(storage.getComputer());
    }
}
