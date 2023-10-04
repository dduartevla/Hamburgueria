package org.example;

public class Hamburguer1 implements Hamburguer{

    float precoLanche;

    Categoria categoria;

    public Hamburguer1(float precoLanche){
        this.precoLanche = precoLanche;
    }


    @Override
    public float getPrecoLanche() {
        return this.categoria.getPrecoAlterado(this.precoLanche);
    }

    @Override
    public String getNomeHamburguer() {
        return "Hamburguer1";
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
