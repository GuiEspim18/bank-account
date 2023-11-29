package br.com.fiap.bankv2.client;

import java.io.Serial;
import java.io.Serializable;

public class Client implements Serializable {
    @Serial private static final long serialVersionUID = 4L;

    private String name;
    private byte age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
