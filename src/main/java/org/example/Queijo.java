package org.example;

public class Queijo extends HamburguerDecorator {
    public Queijo (Hamburguer hamburguer){
        super(hamburguer);
    }
    @Override
    public float getPreco() {
        return 4.00f;
    }

    @Override
    public String getNome() {
        return "Queijo";
    }
}
