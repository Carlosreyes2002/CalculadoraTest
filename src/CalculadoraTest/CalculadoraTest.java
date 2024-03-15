package CalculadoraTest;

import Calculadora.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.restar(6, 3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(12, calculadora.multiplicar(3, 4));
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.5, calculadora.dividir(5, 2), 0.001); // Se usa delta para comparar números decimales
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(5, 0);
    }
}
