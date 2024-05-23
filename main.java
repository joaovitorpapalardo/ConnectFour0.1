package main;

import console.Console;
import cores.StringColorida;
import backend.*;
/**
 *
 * @author joao.machado
 */
public class main {

    public static void main(String[] args) {
        StringColorida cartao = new StringColorida("O", "AZUL");
        CartaBaralho carta = new CartaBaralho(cartao);
        Console.println(cartao);

        StringColorida cartax = new StringColorida("X", "VERMELHO");
        Console.println(cartax);
        
    }
        
}