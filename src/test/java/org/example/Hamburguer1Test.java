package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hamburguer1Test {

    @Test
    void deveRetornarHamburguerBasico(){
        Hamburguer hamburguer = new Hamburguer1(15.00f);
        assertEquals(30.0f,hamburguer.getPrecoLanche());
    }

    @Test
    void deveRetornarHaburguerMaisBacon(){
        Hamburguer hamburguer = new Bacon(new Hamburguer1(15.00f));
        assertEquals(18.00f, hamburguer.getPrecoLanche());
    }

    @Test
    void deveRetornarHamburguerMaisBaconMaisQueijo(){
        Hamburguer hamburguer = new Bacon(new Queijo(new Hamburguer1(15.00f)));
        assertEquals(22.00f,hamburguer.getPrecoLanche());
    }

    @Test
    void deveRetornarHamburguerMaisBaconMaisQueijoMaisovo(){
        Hamburguer hamburguer = new Bacon(new Queijo( new Ovo (new Hamburguer1(15.00f))));
        assertEquals(24.00f, hamburguer.getPrecoLanche());
    }

    @Test
    void deveRetornarHamburgueriaMaisBaconMaisovo(){
        Hamburguer hamburguer = new Bacon(new Ovo(new Hamburguer1(15.00f)));
        assertEquals(20.00f,hamburguer.getPrecoLanche());
    }

    @Test
    void deveRetornarNomeHamburguerBasico(){
        Hamburguer hamburguer = new Hamburguer1(15.00f);
        assertEquals("Hamburguer1",hamburguer.getNomeHamburguer());
    }

    @Test
    void deveRetornarNomeHamburguerBasicoMaisBacon(){
        Hamburguer hamburguer = new Bacon(new Hamburguer1(15.00f));
        assertEquals("Hamburguer1 >> Bacon",hamburguer.getNomeHamburguer());
    }

    @Test
    void deveRetornarNomeHamburguerBasicoMaisBaconMaisQueijo(){
        Hamburguer hamburguer = new Queijo(new Bacon (new Hamburguer1(15.00f)));
        assertEquals("Hamburguer1 >> Bacon >> Queijo",hamburguer.getNomeHamburguer());
    }

    @Test
    void deveRetornarNomeHamburguerBasicoMaisBaconMaisQueijoMaisOvo(){
        Hamburguer hamburguer = new Ovo(new Queijo(new Bacon (new Hamburguer1(15.00f))));
        assertEquals("Hamburguer1 >> Bacon >> Queijo >> Ovo",hamburguer.getNomeHamburguer());
    }

    @Test
    void deveRetornarNomeHamburguerBasicoMaisBaconMaisOvo(){
        Hamburguer hamburguer = new Ovo(new Bacon (new Hamburguer1(15.00f)));
        assertEquals("Hamburguer1 >> Bacon >> Ovo",hamburguer.getNomeHamburguer());
    }
}