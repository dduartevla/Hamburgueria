package org.example;

public class Kids implements Categoria{
    @Override
    public float getPrecoAlterado(float preco) {
        return preco = (preco*0.2f);
    }
}
