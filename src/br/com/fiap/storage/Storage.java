package br.com.fiap.storage;

import java.io.Serializable;
import java.io.Serial;

public class Storage implements Serializable {
    @Serial private static final long serialVersionUID = 2L;
    private int computer;

    public Storage () {
    }

    public void setComputer(int computer) {
        this.computer += computer;
    }

    public int getComputer() {
        return computer;
    }

    public void reduceStorage (int quantity) {
        if (this.computer > 0) {
            this.computer -= quantity;
        }
    }
}
