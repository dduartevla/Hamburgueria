package org.example;

public abstract class HamburguerDecorator implements Hamburguer{

    private Hamburguer hamburguer;
    public String nomeLanche;

    public HamburguerDecorator(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public HamburguerDecorator(){}

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getPreco();

    public float getPrecoLanche(){
        return this.hamburguer.getPrecoLanche() + this.getPreco();
    }

    public abstract String getNome();

    public String getNomeHamburguer(){
        return this.hamburguer.getNomeHamburguer() + " >> " +
                this.getNome();
    }

    public void setNomeLanche(String nomeLanche){
        this.nomeLanche = nomeLanche;
    }
}
