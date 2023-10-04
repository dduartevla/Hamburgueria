package org.example;

public class Hamburguer1 implements Hamburguer{

    float precoLanche;

    public Hamburguer1(float precoLanche){
        this.precoLanche = precoLanche;
    }


    @Override
    public float getPrecoLanche() {
        return this.precoLanche;
    }

    @Override
    public String getNomeHamburguer() {
        return "Hamburguer1";
    }

}
