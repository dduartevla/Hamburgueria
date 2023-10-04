package org.example;

public class Vegano implements Categoria{
    @Override
    public float getPrecoAlterado(float preco) {
        return preco - (preco*0.3f);
    }
}
