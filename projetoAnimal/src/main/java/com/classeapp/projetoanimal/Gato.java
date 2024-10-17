
package com.classeapp.projetoanimal;

/**
 *
 * @author Isabelle Moura da Silva
 */
public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("O gato está miando! Miau Miau!!");
    }
    
}
