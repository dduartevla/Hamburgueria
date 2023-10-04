package org.example;

public class Gourmet implements Categoria {
    @Override
    public float getPrecoAlterado(float preco) {
        return preco + preco;
    }
}
