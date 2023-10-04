package org.example;

public class Ovo extends HamburguerDecorator {
    public Ovo (Hamburguer hamburguer){
        super(hamburguer);
    }
    @Override
    public float getPreco() {
        return 2.00f;
    }

    @Override
    public String getNome() {
        return "Ovo";
    }
}
