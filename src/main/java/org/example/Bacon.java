package org.example;

public class Bacon extends HamburguerDecorator {

    public Bacon (Hamburguer hamburguer){
        super(hamburguer);
    }
    @Override
    public float getPreco() {
        return 3.00f;
    }

    @Override
    public String getNome() {
        return "Bacon";
    }
}
